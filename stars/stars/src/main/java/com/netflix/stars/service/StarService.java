package com.netflix.stars.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stars")
public class StarService {

	@RequestMapping("/{movieId}")
	public String getStars(@PathVariable("movieId") Integer movieId) {
		
		String stars = null;
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Avatar");
		map.put(2, "Bahubali");
		map.put(3, "Godzilla");
		map.put(4, "Avengers");
		
		stars = map.get(movieId);
		
		return stars;
	}
}
