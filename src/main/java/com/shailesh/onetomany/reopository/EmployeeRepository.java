package com.shailesh.onetomany.reopository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shailesh.onetomany.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
