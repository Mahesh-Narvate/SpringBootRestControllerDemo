package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.course.topic.TopicController;

/*@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration*/
@ComponentScan({"io.course"})
@EntityScan("io.course")
@EnableJpaRepositories("io.course")
@SpringBootApplication
public class CourseApiDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDatabaseApplication.class, args); 
		System.out.println(" In Curd Operation Project....!");
	}

}
