package com.haiki.legacy;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haiki.model.Activity;
import com.haiki.model.NewsPiece;

//@Controller
public class NewsController {

	// @Autowired
	private ExerciseService exerciseService;

	// @RequestMapping(value = "/addNews")
	public String addNews(@ModelAttribute("newsPiece") NewsPiece newsPiece) {

		System.out.println("news: " + newsPiece.getNewsPieceTitle());
		System.out.println("activity: " + newsPiece.getActivity());

		return "addNews";
	}

	// @RequestMapping(value= "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}

}
