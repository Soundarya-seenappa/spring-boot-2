package com.sound.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sound.model.*;
@Configuration
@ComponentScan(basePackages = "com.sound.model,com.sound.dao")

public class SpringConfig {
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate= new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
   @Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/boot_cam_db");
		dataSource.setUsername("root");
		dataSource.setPassword("preethi8147");
		return dataSource;
	}
	
	
	}

