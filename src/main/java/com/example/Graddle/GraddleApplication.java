package com.example.Graddle;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(info = @Info(title = "Feign with Gradle", description = "Feign Client with Gradle"))
public class GraddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraddleApplication.class, args);
	}

}
