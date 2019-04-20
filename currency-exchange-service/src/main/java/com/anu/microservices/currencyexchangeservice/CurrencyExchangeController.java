package com.anu.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment env;
	
	@Autowired
	ExchangeValueRepository repo;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
	
		ExchangeValue exchangeValue= repo.findByFromAndTo(from, to);
		logger.info("###################################here in CurrencyExchangeServiceApplication",exchangeValue);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return exchangeValue;
	}

}
