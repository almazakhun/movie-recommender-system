package lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
	@Autowired
    private Filter contentBasedFilter;

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");
        
        return results;
    }
}
