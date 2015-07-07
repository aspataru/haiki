package com.haiki.service;

import org.springframework.stereotype.Service;

import com.haiki.model.Hike;
import com.haiki.model.HikeList;

@Service("hikeService")
public class HikeServiceImpl implements HikeService {

	HikeList hikes = new HikeList(new Hike("title", "desc"));
	
	public HikeList getHikes() {
		return hikes;
	}

	public void addHike(Hike hike) {
		hikes.addHike(hike);
	}
	
	

}
