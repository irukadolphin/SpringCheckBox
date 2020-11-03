package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CheckBoxFormDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	public CheckBoxFormDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertCheckBoxForm(String title,String genre) {
		
		jdbcTemplate.update("INSERT INTO checkboxTest2 (title,genru) VALUES (?,?)",title,genre);
		
	}
	
}
