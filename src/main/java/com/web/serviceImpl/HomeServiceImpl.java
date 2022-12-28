package com.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Employee;
import com.web.repository.EmpRepository;
import com.web.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{	
	@Autowired
	EmpRepository er;

	@Override
	public void saveEmp(Employee e)
	{
		er.save(e);
	}

}
