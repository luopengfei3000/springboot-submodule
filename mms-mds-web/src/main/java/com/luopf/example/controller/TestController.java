package com.luopf.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luopf.example.mmsservice.service.TestService;

@RestController
@RequestMapping(value = "/mds")
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "test")
	public String getName(){
		String name = testService.getName();
		return name;
	}

}
