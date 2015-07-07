package com.haiki.service;

import com.haiki.model.Hike;
import com.haiki.model.HikeList;

public interface HikeService {
	
	public HikeList getHikes();
	public void addHike(Hike hike);

}
