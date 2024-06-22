package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	public Function<String,String> upperCase(){
		return value->value.toUpperCase();
	}

	@Bean
	public Supplier<String> hello() {
		return () -> "Hello, Spring Cloud Function!";
	}

}
