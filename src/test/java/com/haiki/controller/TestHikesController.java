package com.haiki.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.haiki.model.Hike;
import com.haiki.service.HikeService;
import com.haiki.util.Constants;

public class TestHikesController {

	private static final String HIKES_PAGE = "hikes";
	private static final String ADMIN_HIKE_PAGE = "hikeAdmin";
	private static final String ADMIN_HIKE_REDIRECT = "redirect:admin.html";

	@Mock
	private HikeService hikeService;

	@Mock
	private Model model;

	@Mock
	private BindingResult bindingResult;

	@InjectMocks
	private HikesController hikesController;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldCallHikeServiceAndReturnHikesPageWhenGettingHikes() {
		String page = hikesController.hikes(model);
		verify(hikeService).getHikes();
		verify(model).addAttribute(eq("hikeList"), anyObject());
		assertEquals(HIKES_PAGE, page);
	}

	@Test
	public void shouldCallHikeServiceAndReturnAdminHikesPageWhenGettingNewHike() {
		String page = hikesController.newHike(model);
		verify(hikeService).getHikes();
		verify(model).addAttribute(eq("hikeList"), anyObject());
		verify(model).addAttribute(
				eq("hike"),
				eq(new Hike(Constants.DEFAULT_HIKE_TITLE,
						Constants.DEFAULT_HIKE_DESCRIPTION)));
		assertEquals(ADMIN_HIKE_PAGE, page);
	}

	@Test
	public void shouldCallHikeServiceAndRedirectToAdminHikesPageWhenPostingNewHike() {
		Hike postedHike = new Hike("title", "description");
		String page = hikesController.newHike(postedHike, bindingResult);
		verify(hikeService).addHike(eq(postedHike));
		assertEquals(ADMIN_HIKE_REDIRECT, page);
	}
	
	@Test
	public void shouldCallHikeServiceAndRedirectToAdminHikesPageWhenDeletingHike() {
		Hike deletedHike = new Hike("title", "description");
		String page = hikesController.removeHike(deletedHike, bindingResult);
		verify(hikeService).removeHike(eq(deletedHike));
		assertEquals(ADMIN_HIKE_REDIRECT, page);
	}

}
