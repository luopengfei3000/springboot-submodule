package com.luopf.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pms")
public class PmsController {

	@RequestMapping(value = "test")
	public String getName(){
		return "123";
	}
}
