package com.haiki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haiki.controller.MongoService;
import com.haiki.model.Hike;
import com.haiki.model.HikeList;

@Service("hikeService")
public class HikeServiceImpl implements HikeService {

	//HikeList hikes = new HikeList(new Hike("title", "desc"));
	
	@Autowired
	private MongoService mongoService;
	
	public HikeList getHikes() {
		HikeList hikeList = new HikeList();
		for (Hike currentHike : mongoService.getAllHikes()) {
			hikeList.addHike(currentHike);
		}
		return hikeList;
	}

	public void addHike(Hike hike) {
		mongoService.save(hike);
	}
	
	

}
