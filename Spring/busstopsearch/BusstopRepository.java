package com.bus.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.riding.busstopsearch.vo.Busstop;

public class BusstopRepository {
	private List<Busstop> busstopList = new ArrayList<>();
	
	public BusstopRepository() {
		busstopList.add(new Busstop("성일정보고", Arrays.asList(92, 6, 18)));
		busstopList.add(new Busstop("단대오거리", Arrays.asList(93, 11, 3)));
		busstopList.add(new Busstop("신흥역", Arrays.asList(93, 11, 22)));
		busstopList.add(new Busstop("대하초교", Arrays.asList(94, 1, 15)));
		busstopList.add(new Busstop("현대아파트", Arrays.asList(94, 10, 6)));
		busstopList.add(new Busstop("성남고", Arrays.asList(96, 1, 26)));
	}
	
	public List<Busstop> findby(String keyword) {
		List<Busstop> result = new ArrayList<>();
		for (Busstop busstop : busstopList) {
			System.out.println(busstop.getName());
			if (busstop.getName().contains(keyword)) {
				result.add(busstop);
			}
		}
		return result;
	}
}
