package com.example.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.project.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>  {

}
