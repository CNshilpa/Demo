package com.bridgelab.fundoonote.user;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.bridgelab.fundoonote.user.utility.TokenManager;

@SpringBootApplication
public class FundooNoteApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public TokenManager tokenManager() {
		return new TokenManager();
	}

	public static void main(String[] args) {
		SpringApplication.run(FundooNoteApplication.class, args);
	}

}
