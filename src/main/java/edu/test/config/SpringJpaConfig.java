package edu.test.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootConfiguration
@ComponentScan(basePackages = {"edu.test.daos"})
@EntityScan(basePackages  = {"edu.test.entities"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class SpringJpaConfig {
	//Not required because of DataSourceConfiguration.Tomcat matched:
	/*@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		return ds;
	}*/

	//Not required because of JpaBaseConfiguration#jpaVendorAdapter matched
	/*@Bean
	public JpaVendorAdapter hibJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.ORACLE);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		// adapter.setDatabasePlatform("org.hibernate.dialect.Oracle10gDialect");
		return adapter;
	}*/

	//Not required because of HibernateJpaAutoConfiguration matched
	/*@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds,
			JpaVendorAdapter jpaVendorAdapter) {
		LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
		emfb.setDataSource(ds);
		emfb.setJpaVendorAdapter(jpaVendorAdapter);
		emfb.setPackagesToScan("edu.aspire.entities");
		return emfb;
	}*/

	//Not required because of JpaBaseConfiguration#transactionManager matched 
	/*@Bean
	public PlatformTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
		EntityManagerFactory factory = entityManagerFactory.getObject();
		return new JpaTransactionManager(factory);
	}*/
}
