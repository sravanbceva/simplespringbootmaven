package com.sravan.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sravan.limitservice.bean.Limits;
import com.sravan.limitservice.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retriveLimits()
	{
		return new Limits( configuration.getMinimum() , configuration.getMaximum() );
	}

}
