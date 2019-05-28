package com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//this is same as the procedure above implemented
//@JsonIgnoreProperties(value= {"name,sex..."})
@JsonFilter("StudentFilter")
public class Student {

	private String name;
	
	//@JsonIgnore now handled for individual field filtering for specific request in student controller
	private String sex;
	
	public Student(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + "]";
	}
	
	
	
}
