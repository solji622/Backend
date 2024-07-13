package com.riding.busstopsearch.vo;

import java.util.List;

public class Busstop {
	private String name;
	private List<Integer> buses;
	
	public Busstop(String name, List<Integer> buses) {
		this.name = name;
		this.buses = buses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getBuses() {
		return buses;
	}

	public void setBuses(List<Integer> buses) {
		this.buses = buses;
	}
	
	
}


