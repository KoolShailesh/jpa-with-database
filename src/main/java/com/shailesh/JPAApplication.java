package com.shailesh;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.shailesh.onetomany.entity.Employee;
import com.shailesh.onetomany.entity.Task;
import com.shailesh.onetomany.reopository.EmployeeRepository;
import com.shailesh.onetomany.service.EmployeeService;

@SpringBootApplication
@EnableJpaRepositories
public class JPAApplication {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(JPAApplication.class, args);
	}

	@PostConstruct
	@Transactional
	private void insterEmployee() {

		Task task = Task.builder().description("new Task").build();
		Task task1 = Task.builder().description("new Task").build();

		List<Task> tasks = new ArrayList<>();

		tasks.add(task);
		tasks.add(task1);

		Employee employee = Employee.builder().firstName("Shailesh").lastName("Chandra").tasks(tasks).build();

		task.setEmployee(employee);
		task1.setEmployee(employee);
		///employeeRepository.save(employee);
		
//		List<Employee> findAll = employeeRepository.findAll();
//		
//		findAll.forEach(System.out:: println);
		
		List<Task> findAll = employeeService.getAllTasks();
		
		

	}

}
