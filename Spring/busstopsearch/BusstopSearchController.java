package com.riding.busstopsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.riding.busstopsearch.service.BusttopSearchService;
import com.riding.busstopsearch.vo.Busstop;

@RestController //숙제 이게 멀까 Rest API
public class BusstopSearchController {
	
	@Autowired
	private BusttopSearchService service;
	
	@GetMapping //post put delete
	public String greeting() {
		return "success";
	}

	@GetMapping("/busstop/{keyword}")
	public List<Busstop> searchBusstop(@PathVariable String keyword) {
		return service.search(keyword);
	}
}
