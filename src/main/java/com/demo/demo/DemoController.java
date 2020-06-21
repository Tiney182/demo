package com.demo.demo;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping(value = "/hello", produces = MediaType.ALL_VALUE)
	public ResponseEntity<String> basicGetMethod () {
		return ResponseEntity.ok("Hello world!");
	}
}
