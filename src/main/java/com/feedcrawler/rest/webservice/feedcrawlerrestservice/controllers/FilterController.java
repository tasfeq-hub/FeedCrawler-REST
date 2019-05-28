package com.feedcrawler.rest.webservice.feedcrawlerrestservice.controllers;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.Student;

@RestController
public class FilterController {

	// get only name of student. Not Sex
	@GetMapping("/filtered-contents-1")
	public MappingJacksonValue getStudent() {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
		FilterProvider filters = new SimpleFilterProvider().addFilter("StudentFilter", filter);
		Student std = new Student("Rafi","Male");
		MappingJacksonValue mapping = new MappingJacksonValue(std);
		mapping.setFilters(filters);
		return mapping;
	}
	
	// get only Sex of student. Not name
	@GetMapping("/filtered-contents-2")
	public MappingJacksonValue getStudents() {
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("sex");
		FilterProvider filters = new SimpleFilterProvider().addFilter("StudentFilter", filter);
		Student std = new Student("Rashed","Female");
		MappingJacksonValue mapping = new MappingJacksonValue(std);
		mapping.setFilters(filters);
		return mapping;
	}
	
}
