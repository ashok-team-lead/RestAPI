package com.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,SecurityAutoConfiguration.class})
public class Application {
	@Autowired
	private Environment env;
   
	
	
	
	  @Bean public DataSource dataSource() { DriverManagerDataSource dataSource =
	  new DriverManagerDataSource();
	  dataSource.setDriverClassName(env.getProperty("db.driverClassName"));
	  dataSource.setUrl(env.getProperty("db.url"));
	  dataSource.setUsername(env.getProperty("db.username"));
	  dataSource.setPassword(env.getProperty("db.password"));
	  
	  return dataSource; }
	 
	 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
