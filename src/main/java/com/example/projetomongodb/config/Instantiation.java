package com.example.projetomongodb.config;

import java.util.Arrays;

import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.projetomongodb.domain.User;
import com.example.projetomongodb.resources.UserResource;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserResource userResource;
	
	@Override
	public void run(String... args0) throws Exception {
		

		User Maria = new User ("Maria", "24", "56");
		User João = new User  ("Joao", "38", "78");
		
	}

}
