package com.anu.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionmultiple;
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionmultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionmultiple = conversionmultiple;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionmultiple() {
		return conversionmultiple;
	}
	public void setConversionmultiple(BigDecimal conversionmultiple) {
		this.conversionmultiple = conversionmultiple;
	}
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionmultiple="
				+ conversionmultiple + "]";
	}
	
	

}
