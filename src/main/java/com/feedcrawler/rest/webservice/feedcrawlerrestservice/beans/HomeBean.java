package com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans;

public class HomeBean {

	private String message;

	public HomeBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HomeBean [message=" + message + "]";
	}
	
	public String showMessage() {
		return this.getMessage();
	}
	
	
}
