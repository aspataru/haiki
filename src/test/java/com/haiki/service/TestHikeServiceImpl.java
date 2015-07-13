package com.haiki.service;


import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.haiki.model.Hike;

public class TestHikeServiceImpl {
	
	@Mock
	private MongoService mongoService;
	
	@InjectMocks
	private HikeServiceImpl hikeService;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldCallGetAllHikes() {
		hikeService.getHikes();
		verify(mongoService).getAllHikes();
	}
	
	@Test
	public void shouldCallSaveHike() {
		Hike hike = new Hike("title", "desc");
		hikeService.addHike(hike);
		verify(mongoService).save(hike);
	}
	
}
