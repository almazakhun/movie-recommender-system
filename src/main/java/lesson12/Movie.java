package lesson12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component 
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Movie {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;  
    private String producer; 
 
    public Movie() {
        super();
        logger.info("In Movie constructor method");     
    }

    @PostConstruct
    private void postConstruct() {
        //initialization code
        logger.info("In Movie postConstruct method");
    }
    
    @PreDestroy
    private void preDestroy() {
        //cleanup code
        logger.info("In Movie preDestroy method");
    }  

    //...
}