package org.humingk.movie.dal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author humingk
 */
@SpringBootApplication
@EnableEurekaClient
public class MovieDalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieDalApplication.class, args);
    }

}