package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpMapper;
import com.example.demo.po.Emp;
import com.example.demo.po.EmpExample;
import com.example.demo.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public List<Emp> queryAll() {
		return empMapper.selectByExample(new EmpExample());
	}

	
}
