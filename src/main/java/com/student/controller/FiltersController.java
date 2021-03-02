package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Filters;
import com.student.service.FiltersService;

@RestController
//@RequestMapping("/Filters")
public class FiltersController {
	
	@Autowired
	private FiltersService filterservice;
	
	@GetMapping("/getAllFilters")
	public List<Filters> listAll()
	{
		System.out.println("In controller");
		return filterservice.listAll();
	}

}
