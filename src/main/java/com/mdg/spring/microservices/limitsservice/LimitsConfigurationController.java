package com.mdg.spring.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdg.spring.microservices.limitsservice.beans.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitsConfiguration getLimitsFromConfiguration() {
		return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
}
