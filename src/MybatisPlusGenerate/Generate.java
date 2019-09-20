package MybatisPlusGenerate;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;

/**
 * mybatisplus�ٷ�
 * @author 65629
 *
 */
public class Generate {
	public static void main(String[] args) {
		GlobalConfig globalConfig = new GlobalConfig();
		globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		globalConfig.setAuthor("jobob");
		globalConfig.setOpen(false);
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setUrl(
				"jdbc:mysql://192.168.1.250:3306/theme_screenshot?characterEncoding=utf8&useSSL=false&characterEncoding=utf8");
		dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
		dataSourceConfig.setUsername("root");
		dataSourceConfig.setPassword("vlife");
		
		TemplateConfig templateConfig = new TemplateConfig().setEntity("templates/entity2.java");
		AutoGenerator mpg = new AutoGenerator();
		// �����Զ���ģ��
		mpg.setTemplate(templateConfig);
//		new DataSourceConfig().setDbQuery(new MySqlQuery() {
//
//		    /**
//		     * ��д����Ԥ����ѯ�Զ����ֶ�<br>
//		     * �����ѯ�� SQL ��Ӧ���� tableFieldsSql �Ĳ�ѯ�ֶΣ�Ĭ�ϲ������������������д��<br>
//		     * ģ���е��ã�  table.fields ��ȡ�����ֶ���Ϣ��
//		     * Ȼ��ѭ���ֶλ�ȡ field.customMap �� MAP �л�ȡע���ֶ�����  NULL ���� PRIVILEGES
//		     */
//		    @Override
//		    public String[] fieldCustom() {
//		        return new String[]{"NULL", "PRIVILEGES"};
//		    }
//		})
	}
}
