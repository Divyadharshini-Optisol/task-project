package com.example.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Task;
import com.example.project.repository.TaskRepository;


@Service
public class TaskService {
	
	@Autowired  
	TaskRepository taskRepository;
	
	// CREATE  save() 
	
    public void saveTask(Task task)   
	{  
		taskRepository.save(task);  
	}  
	
	//READ findaAll()  
    
	public List<Task> getTask()   
	{  
	List<Task> task = new ArrayList<Task>();  
	taskRepository.findAll().forEach(tasks1 -> task.add(tasks1));  
	return task;  
	}  

	// READ  findById() 
	
	public Task getTaskById(int id)   
	{  
	return taskRepository.findById(id).get();  
	}  
	
	//UPDATE  save()

	public void update(Task task, int id)   
	{  
		taskRepository.save(task);  
	}  
	
	//DELETE  deleteById() 
	
	public void delete(int id)   
	{  
		taskRepository.deleteById(id);  
	}  
	

}
