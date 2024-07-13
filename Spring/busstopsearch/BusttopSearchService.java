package com.riding.busstopsearch.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.bus.common.BusstopRepository;
import com.riding.busstopsearch.vo.Busstop;

@Service
public class BusttopSearchService {
	private Set<String> historyKeyword = new HashSet<>(); 
	
	private BusstopRepository busstopRepository = new BusstopRepository();
	
	public List<Busstop> search(String keyword) {
		historyKeyword.add(keyword);
		return busstopRepository.findby(keyword);
	}
}
