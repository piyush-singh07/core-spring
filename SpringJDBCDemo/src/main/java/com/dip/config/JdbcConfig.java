package com.dip.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.dip.components")
public class JdbcConfig {

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
		dataSource1.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource1.setPassword("Password@123");
		dataSource1.setUrl("jdbc:mysql://localhost:3306/ticket_db");
		dataSource1.setUsername("root");
		return dataSource1;
	}

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate1 = new JdbcTemplate();
		jdbcTemplate1.setDataSource(dataSource());
		return jdbcTemplate1;
	}

}
