package MybatisPlusGenerate;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;

/**
 * mybatisplus官方
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
		// 配置自定义模板
		mpg.setTemplate(templateConfig);
//		new DataSourceConfig().setDbQuery(new MySqlQuery() {
//
//		    /**
//		     * 重写父类预留查询自定义字段<br>
//		     * 这里查询的 SQL 对应父类 tableFieldsSql 的查询字段，默认不能满足你的需求请重写它<br>
//		     * 模板中调用：  table.fields 获取所有字段信息，
//		     * 然后循环字段获取 field.customMap 从 MAP 中获取注入字段如下  NULL 或者 PRIVILEGES
//		     */
//		    @Override
//		    public String[] fieldCustom() {
//		        return new String[]{"NULL", "PRIVILEGES"};
//		    }
//		})
	}
}
