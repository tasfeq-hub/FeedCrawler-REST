package com.feedcrawler.rest.webservice.feedcrawlerrestservice.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.FeedTitle;
import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.FeedV1;
import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.FeedV2;
import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.HomeBean;

@RestController
public class HomeController {

	
	@Autowired
	private MessageSource messageSource;
	
	// returning string
	// URI /home
	@RequestMapping(method=RequestMethod.GET, path="/home")
	public String home() {
		return messageSource.getMessage("good.morning.message",null,LocaleContextHolder.getLocale());
	}
	
	// returning integer
	// URI /new-home
	@GetMapping(path="/new-home")
	public int newHome() {
		return 99;
	}
	
	// returning bean (object)
	// URI /bean
	@GetMapping(path="/bean")
	public HomeBean homeBean() {
		return new HomeBean("Hello This is working...");
	}
	
	// returning bean with variable
	// URI /bean
	@GetMapping(path="/bean/{name}")
	public HomeBean homeBeanWithPathVariable( @PathVariable String name) {
		return new HomeBean(String.format("Hello Mrs, %s", name));
	}
	
	/**** Versioning with URI ****/
	
	@GetMapping(path="/v1/feedtitle")
	public FeedV1 getTitleV1() {
		return new FeedV1("This is title Body and SubBody");
	}
	
	@GetMapping(path="/v2/feedtitle")
	public FeedV2 getTitleV2() {
		return new FeedV2(new FeedTitle("This is title Body"," and SubBody"));
	}
	
	
	/**** Versioning with Parameters ****/
	
	@GetMapping(value="/feedtitle/param",params="v=1")
	public FeedV1 getParamTitleV1() {
		return new FeedV1("This is title Body and SubBody");
	}
	
	@GetMapping(value="/feedtitle/param",params="v=2")
	public FeedV2 getParamTitleV2() {
		return new FeedV2(new FeedTitle("This is title Body"," and SubBody"));
	}
	
	
	/**** Versioning with Header ****/
	
	@GetMapping(value="/feedtitle/header",headers="API-VERSION=1")
	public FeedV1 getHeaderTitleV1() {
		return new FeedV1("This is title Body and SubBody");
	}
	
	@GetMapping(value="/feedtitle/header",headers="API-VERSION=2")
	public FeedV2 getHeaderTitleV2() {
		return new FeedV2(new FeedTitle("This is title Body"," and SubBody"));
	}
	
	
	
	
	
	
	
	
}