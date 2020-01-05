package org.humingk.movie.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author humingk
 */
@SpringBootApplication
@EnableEurekaClient
public class MovieServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieServiceUserApplication.class, args);
	}

}
