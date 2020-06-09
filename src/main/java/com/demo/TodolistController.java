package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TodolistController {

	@PostMapping("todos")
	public void saveItem(@RequestBody TodoDTO item) {
		System.out.println("Saving new task: "+item);
	}
	
	@GetMapping("todos")
	public List<TodoDTO> getTodoList() {
		List<TodoDTO> list = new ArrayList<TodoDTO>();
		list.add(new TodoDTO("Un"));
		list.add(new TodoDTO("Deux"));
		
		System.out.println("getTodoList: "+list.size());
		
		return list;
	}
}
