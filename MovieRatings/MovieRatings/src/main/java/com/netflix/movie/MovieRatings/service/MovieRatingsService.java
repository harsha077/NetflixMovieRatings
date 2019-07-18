package com.netflix.movie.MovieRatings.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.movie.MovieRatings.dto.MovieRatingDTO;

@RestController
public class MovieRatingsService {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/movierating/{movieId}")
	public MovieRatingDTO getRatings(@PathVariable("movieId") Integer movieId) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		MovieRatingDTO rating = new MovieRatingDTO();
		map.put(1, "Avatar");
		map.put(2, "Bahubali");
		map.put(3, "Godzilla");
		map.put(4, "Avengers");
		
		/*String star = restTemplate.getForObject("http://movie-ratings-stars/stars/"+movieId, String.class);
		
		String comment = restTemplate.getForObject("http://movie-ratings-comments/comments/"+movieId, String.class);*/
		
		String star = restTemplate.getForObject("http://MOVIE-RATINGS-STARS/stars/"+movieId.toString(), String.class);
		
		String comment = restTemplate.getForObject("http://MOVIE-RATINGS-COMMENTS/comment/"+movieId.toString(), String.class);
		
		rating.setMovieName(map.get(movieId));
		rating.setStar(star);
		rating.setComment(comment);
		
		return rating;
	}
}
