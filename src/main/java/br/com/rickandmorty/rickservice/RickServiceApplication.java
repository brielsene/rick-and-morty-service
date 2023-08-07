package br.com.rickandmorty.rickservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RickServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RickServiceApplication.class, args);
	}

}
