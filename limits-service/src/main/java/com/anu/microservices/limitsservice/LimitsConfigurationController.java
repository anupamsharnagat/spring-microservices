package com.anu.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration objConfiguration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations()
	{
		return new LimitConfiguration(objConfiguration.getMaximum(),objConfiguration.getMinimum());
		
	}

}
