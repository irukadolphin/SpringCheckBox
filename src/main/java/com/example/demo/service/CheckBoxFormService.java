package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.GenreForm;
import com.example.demo.repository.CheckBoxFormDao;

@Service
public class CheckBoxFormService {
	
	private CheckBoxFormDao checkBoxFormDao;
	
	@Autowired
	public CheckBoxFormService(CheckBoxFormDao checkBoxFormDao) {
		this.checkBoxFormDao = checkBoxFormDao;
	}
	
	public void save(GenreForm genreForm) {
		
		for(String genre : genreForm.getSelectGenre()) {
			checkBoxFormDao.insertCheckBoxForm(genreForm.getTitle(),genre);
		}
	}
	
}
