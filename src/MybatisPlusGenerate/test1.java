package MybatisPlusGenerate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class test1 {
	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();
		// ȫ������
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("E:\\test");// ����ļ�·��
		gc.setFileOverride(true);// �Ƿ񸲸��ļ�
		gc.setActiveRecord(false);// ����ҪActiveRecord���Ե����Ϊfalse
		gc.setEnableCache(false);// XML ��������
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(false);// XML columList
		gc.setAuthor("zhangqq");// ����
		// �Զ����ļ�������ע�� %s ���Զ�����ʵ�����ԣ�
		gc.setControllerName("%sController");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setMapperName("%sMapper");
		gc.setXmlName("%sMapper");
		mpg.setGlobalConfig(gc);
		// ����Դ����
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("vlife");
		dsc.setUrl(
				"jdbc:mysql://192.168.1.250:3306/theme_screenshot?characterEncoding=utf8&useSSL=false&characterEncoding=utf8");
		mpg.setDataSource(dsc);
		// ��������
		StrategyConfig strategy = new StrategyConfig();
		// strategy.setTablePrefix(new String[] { "sys_" });// �˴������޸�Ϊ���ı�ǰ׺
		strategy.setNaming(NamingStrategy.underline_to_camel);// �������ɲ���
		strategy.setInclude(new String[] { "user" }); // ��Ҫ���ɵı�
		strategy.setSuperServiceClass(null);
		strategy.setSuperServiceImplClass(null);
		strategy.setSuperMapperClass(null);
		mpg.setStrategy(strategy);
		// ������
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.example.demo");
		pc.setController("controller");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setMapper("dao");
		pc.setEntity("model");
		pc.setXml("xml");
		mpg.setPackageInfo(pc);

		// ִ������
		mpg.execute();
	}
}
