package mum.edu.cs425.mumBikeMgtSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("mum.edu.cs425.mumBikeMgtSystem")
public class MumBikeMgtSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(MumBikeMgtSystemApplication.class, args);
	}
}
