package com.shailesh.onetomany.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {
	
	
	private long employeeId;

	private String firstName;

	private String lastName;

	private List<TaskResponse> tasks;

}
