package com.example.projetomongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetomongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll (){
		User Maria = new User ("Maria", "24", "56");
		User João = new User  ("Joao", "38", "78");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Maria, João));
		return ResponseEntity.ok().body(list);
}
}
