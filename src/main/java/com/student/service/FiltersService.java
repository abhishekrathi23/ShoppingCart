package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Filters;
import com.student.repository.FilterRepo;

@Service
public class FiltersService {

	@Autowired
	private FilterRepo filterrepo;
	
	public List<Filters> listAll()
	{
		System.out.println("In service");
		return filterrepo.findAll();
	}
}
