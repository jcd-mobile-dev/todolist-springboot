package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodolistService {
	
	@Autowired TaskRepository taskRepository;

	public void createTask(String title) {
		taskRepository.save(new Task(title));
	}

	public List<Task> getTodoList() {
//		List<TodoDTO> list = new ArrayList<TodoDTO>();
//		list.add(new TodoDTO("Un"));
//		list.add(new TodoDTO("Deux"));
		
		return taskRepository.findAll();
	}

	
}
