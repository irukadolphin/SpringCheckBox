package com.example.demo.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.GenreForm;
import com.example.demo.service.CheckBoxFormService;

@Controller
public class CheckBoxController {
	
	private CheckBoxFormService checkBoxFormService;
	
	public CheckBoxController(CheckBoxFormService checkBoxFormService) {
		this.checkBoxFormService = checkBoxFormService;
	}
	
	
	@GetMapping("/")
	public String helloWorldCheckBox(GenreForm genreForm, Model model) {
		
		model.addAttribute("message","ジャンルを選択してください");
		model.addAttribute("genreForm", genreForm);
		model.addAttribute("genreCheckBox", getCheckBoxGenre());
		
		return "/index";
	}
	
	@PostMapping("/saveCheckBox")
	public String saveCheckBoxForm(GenreForm genreForm,Model model) {
		System.out.println(Arrays.toString(genreForm.getSelectGenre()));
		checkBoxFormService.save(genreForm);
		model.addAttribute("message","登録完了");
		model.addAttribute("genreForm", genreForm);
		return "/index";
	}
	
	
	private Map<String ,String> getCheckBoxGenre(){
		
		Map<String,String> checkBoxMap = new LinkedHashMap<String,String>();
		checkBoxMap.put("1","SF");
		checkBoxMap.put("2","ラブコメ");
		checkBoxMap.put("3","アクション");
		checkBoxMap.put("4","ロボット");
		checkBoxMap.put("5","ギャグ");
		checkBoxMap.put("6","スポーツ");
		checkBoxMap.put("7","ミステリー");
		checkBoxMap.put("8","歴史");
		checkBoxMap.put("9","その他");
		
		return checkBoxMap;
	}
}
