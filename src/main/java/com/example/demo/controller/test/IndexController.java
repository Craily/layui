package com.example.demo.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.po.Emp;
import com.example.demo.service.EmpService;

@Controller
@RequestMapping("/test")
public class IndexController {
	
	@Autowired
	private EmpService empService;

	@RequestMapping("/index")
	public String index() {
		return "test/index";
	}
	
	@RequestMapping("/table")
	public String table() {
		return "test/table";
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_UTF8_VALUE, value="/getemp")
	public ResponseEntity<List<Emp>> getEmp() {
		return new ResponseEntity<List<Emp>>(empService.queryAll(), HttpStatus.OK);
	}
}
