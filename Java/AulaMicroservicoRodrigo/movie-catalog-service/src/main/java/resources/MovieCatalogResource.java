package resources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import models.CatologItem;
import models.Movie;
import models.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{user/Id}")
	public List<CatologItem> getCatalog(@PathVariable("userId")String userId){
		
		RestTemplate restTemplate = new RestTemplate();
				
		List<Rating> ratings = Arrays.asList(
				new Rating("123", 2),
				new Rating("124", 6)
				);

		return ratings.stream().map(rating ->{
			Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + rating, Movie.class);
		return new CatologItem(movie.getName(), "TestTest", rating.getRating());
				
		})
				
				
		.collect(Collectors.toList());

	}
}
