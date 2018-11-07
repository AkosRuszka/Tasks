package com.akosruszka.tasks.repository;

import com.akosruszka.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TasksRepository extends CrudRepository<Task, Long> {

    Iterable<Task> findAll();

}
