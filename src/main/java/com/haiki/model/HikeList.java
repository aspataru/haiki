package com.haiki.model;

import java.util.ArrayList;
import java.util.List;

public class HikeList {

	private final List<Hike> hikes;

	public HikeList(Hike first) {
		hikes = new ArrayList<Hike>();
		hikes.add(first);
	}

	public List<Hike> getHikes() {
		return hikes;
	}

	public void addHike(Hike hike) {
		hikes.add(hike);
	}

}
