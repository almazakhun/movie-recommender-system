package lesson7;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {    
		ApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

		//RecommenderImplementation injects dependency using constructor
		System.out.println("Calling getBean() on RecommenderImplementation");
		RecommenderImplementation2 recommender = appContext.getBean(
		                              RecommenderImplementation2.class); 
		
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}
}
