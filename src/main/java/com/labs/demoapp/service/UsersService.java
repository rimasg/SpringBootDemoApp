package com.labs.demoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsersService {

	private static List<String> users = new ArrayList<>();
		
	public UsersService() {
		users.add("Tom");
		users.add("John");
		users.add("Nick");
		users.add("Lola");
		users.add("Peter");
		users.add("Mary");
		users.add("Andy");
		users.add("Jenny");
	}

	public List<String> getUsers() {
		return users;
	}
}
