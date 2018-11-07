package com.akosruszka.tasks.service;

import com.akosruszka.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task t);

    void delete(Long id);

}
