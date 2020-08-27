package com.secure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class StudentController {
	  @GetMapping("/user/{name}")
		public String getName(@PathVariable String name) {
			return "Hello "+name;
		}

}
