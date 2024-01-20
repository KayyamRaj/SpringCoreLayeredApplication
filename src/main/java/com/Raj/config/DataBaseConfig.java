package com.Raj.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource(value = { "database.properties" })
@ComponentScan(basePackages = "com.Raj")
public class DataBaseConfig {
	@Value("${MySqlDriverClassName}")
	private String DriverClassname;
	@Value("${MySqlDriverUrl}")
	private String  DriverUrl;
	@Value("${MySqlUsername}")
	private String  DatabaseUsername;
	@Value("${MySqlPassword}")
	private String  DatabasePassword;
	//Creating DataSource Object
	@Bean
	public DriverManagerDataSource getSource() {
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName(DriverClassname);
		dmd.setUrl(DriverUrl);
		dmd.setUsername(DatabaseUsername);
		dmd.setPassword(DatabasePassword);
		return dmd;
		
	}
	//Creating Jdbc Template Object
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(getSource());
		return jt;
		
		
	}
	

}
