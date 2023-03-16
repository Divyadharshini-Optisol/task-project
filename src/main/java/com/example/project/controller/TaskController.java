package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Task;
import com.example.project.service.TaskService;

@RestController 
public class TaskController {
	
	@Autowired  
	TaskService taskService;  
	
	//Create
	
	@PostMapping("/createTask")  
	private void saveTask(@RequestBody Task task)   
	{  
		taskService.saveTask(task);  
		  
	}  
	
	//Read  
	
	@GetMapping("/fetchTask")  
	private List<Task> getTask()   
	{  
	return taskService.getTask();  
	}  

	//Read specific
	
	@GetMapping("/fetchTask/{id}")  
	private Task getTask(@PathVariable("id") int id)   
	{  
	return taskService.getTaskById(id);  
	}  
	
	//Update   
	
	@PutMapping("/updateTask")  
	private Task update(@RequestBody Task task)   
	{  
		taskService.saveTask(task);  
		return task;  
	}  
		
	//Delete 
	
	@DeleteMapping("/deleteTask/{id}")  
	private void deleteTask(@PathVariable("id") int id)   
	{  
		taskService.delete(id);  
	}  
	
	
	

}
