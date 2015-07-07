package com.haiki.controller;

import java.util.List;

import com.haiki.model.Hike;

public interface MongoService {

	void save(Hike hike);

	List<Hike> getAllHikes();

}