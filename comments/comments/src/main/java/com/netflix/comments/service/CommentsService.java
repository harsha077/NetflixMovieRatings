package com.netflix.comments.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentsService {

	@RequestMapping("/{movieId}")
	public String getComments(@PathVariable("movieId") Integer movieId) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Amazing graphics");
		//map.put(1, "Mindblowing graphics, amazing screenplay but predictable story");
		map.put(2, "Good graphics and fight sequences");
		//map.put(2, "good graphics, good story but not so good screenplay");
		map.put(3, "If like monsters fighting monsters, you will like it if not watch it on netflix when it comes");
		map.put(4, "Amazing story line, Great performances, Great graphics");
		
		String comment = map.get(movieId);
		return comment;
	}
}
