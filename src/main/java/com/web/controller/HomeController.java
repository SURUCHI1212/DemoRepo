package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Employee;
import com.web.service.HomeService;

@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveEmp(@RequestBody Employee e)
	{
		hs.saveEmp(e);
		System.out.println("save emp ="+e);
		return "saved";
	}

}
