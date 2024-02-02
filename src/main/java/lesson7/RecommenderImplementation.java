package lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class RecommenderImplementation {
    private Filter filter;
	@Autowired
	public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
	    this.filter = filter;
	    System.out.println("Constructor invoked...");
	}

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");
        
        return results;
    }
}
