package com.api.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;

@Configuration 
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value= { @ComponentScan("com.api.dao"), @ComponentScan("com.api.service") })

public class AppConfig {

	@Autowired
	private Environment env;
	
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		
		Properties props = new Properties();
		
		return factoryBean;
		
	}
}
