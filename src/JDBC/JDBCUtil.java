package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JDBCUtil {
	public static void main(String[] args) {
		Set<Font43Server> fontList = new HashSet<>();
		//List<Font43Server> fontList = new ArrayList<>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			String driverClass = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://192.168.1.250:3306/font?characterEncoding=utf8";
			String user = "root";
			String pass = "vlife";

			Class.forName(driverClass);
			connection = DriverManager.getConnection(url, user, pass);

			String sql = "SELECT upload_account, vendor, name FROM fun_design_artwork";
			preparedStatement = connection.prepareStatement(sql);

			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Font43Server font = new Font43Server();
				font.setFontVendor(resultSet.getString(1));
				font.setVendor(resultSet.getString(2));
				font.setFontName(resultSet.getString(3));
				fontList.add(font);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		for(Font43Server f : fontList) {
			System.out.println(f.getVendor()+"   字体厂商："+f.getFontVendor()+"   字体名称： "+f.getFontName());
		}
	}
}
