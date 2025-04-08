package com.AssesmentProjects.Task_Manager_Backend.repository;

import com.AssesmentProjects.Task_Manager_Backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> Id(long id);
}
