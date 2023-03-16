package com.example.project.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="task_title")
	private String taskTitle;
	
	@Column(name="task_description")
	private String taskDescription;
	
	@Column(name="task_status")
	private String taskStatus;
	
	@Column(name="task_priority")
	private String taskPriority;
	
	@Column(name="task_deadline")
	private LocalDate taskDeadline;
	
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public LocalDate getTaskDeadline() {
		return taskDeadline;
	}

	public void setTaskDeadline(LocalDate taskDeadline) {
		this.taskDeadline = taskDeadline;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskTitle=" + taskTitle + ", taskDescription=" + taskDescription + ", taskStatus="
				+ taskStatus + ", taskPriority=" + taskPriority + ", taskDeadline=" + taskDeadline + "]";
	}
	
	
}
