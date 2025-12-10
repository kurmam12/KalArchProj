package com.cog.pract.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleRegstrationController {
	
	@GetMapping(value="/welcome")
	public String getValue() {
		return "kalyan";
	}

}
