package com.shailesh.onetomany.reopository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shailesh.onetomany.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
