package com.shailesh.onetomany.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shailesh.onetomany.entity.Task;
import com.shailesh.onetomany.reopository.TaskRepository;
import com.shailesh.onetomany.response.EmployeeResponse;
import com.shailesh.onetomany.response.TaskResponse;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> getAllTasks() {

		List<Task> findAll = taskRepository.findAll();
		for (Iterator<Task> iterator = findAll.iterator(); iterator.hasNext();) {
			Task task = iterator.next();
			System.out.println(task.getEmployee().getFirstName());

		}

		return findAll;
	}

	public TaskResponse getask(Long id) {

		Optional<Task> tasksOptional = taskRepository.findById(id);

		TaskResponse taskResponse = tasksOptional.map(t -> TaskResponse.builder().description(t.getDescription()).taskId(t.getTaskId())
				.employee(EmployeeResponse.builder().employeeId(t.getEmployee().getEmployeeId())
						.firstName(t.getEmployee().getFirstName()).lastName(t.getEmployee().getLastName()).build())
				.build()).orElse(TaskResponse.builder().build());

		return taskResponse;
	}

}
