package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandlinerunner(
			StudentRepository repository)
	{
		return args->{
			Student shah=new Student("Shahnawaz"
					,"shahnawazahmadk@gmail.com"
					,25
					,LocalDate.of(2000,Month.APRIL,5));
			
			Student shivam=new Student("Shivam	"
					,"shivamshukla657@gmail.com"
					,20
					,LocalDate.of(2000,Month.APRIL,5));
			
			
			repository.saveAll(
					List.of(shah,shivam)
					);
			
			
			
			
		};
	}

}
