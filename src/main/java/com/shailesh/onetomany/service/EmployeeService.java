package com.shailesh.onetomany.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shailesh.onetomany.entity.Task;
import com.shailesh.onetomany.reopository.TaskRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> getAllTasks() {

		List<Task> findAll = taskRepository.findAll();
		findAll.forEach(t -> System.err.println(t.getEmployee().getFirstName()));
		return findAll;
	}

}
