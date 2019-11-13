package com.shailesh.onetomany.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shailesh.onetomany.response.TaskResponse;
import com.shailesh.onetomany.service.EmployeeService;

@RestController
@RequestMapping("/employee/")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/task/{taskid}")
	public TaskResponse  getTask(@PathVariable("taskid")  long taskId){
			TaskResponse getask = employeeService.getask(taskId);
			return getask;
		
		
		
	}

}
