package com.example.demo.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		return "test/index";
	}
}
