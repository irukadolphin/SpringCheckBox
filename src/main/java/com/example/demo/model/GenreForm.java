package com.example.demo.model;

public class GenreForm {
	private String title;
	private String[] selectGenre = {"1"};
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getSelectGenre() {
		return selectGenre;
	}

	public void setSelectGenre(String[] selectGenre) {
		this.selectGenre = selectGenre;
	}
	
}
