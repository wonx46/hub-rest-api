package com.phincon.spice.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.phincon.spice"})
@PropertySources({
	@PropertySource("classpath:application.properties")
})
public class SpiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpiceRestApiApplication.class, args);
	}

}
