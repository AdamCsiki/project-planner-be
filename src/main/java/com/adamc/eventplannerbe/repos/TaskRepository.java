package com.adamc.eventplannerbe.repos;

import com.adamc.eventplannerbe.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findOneById(Long id);
}
