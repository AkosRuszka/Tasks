package com.akosruszka.tasks.service;

import com.akosruszka.tasks.domain.Task;
import com.akosruszka.tasks.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TasksRepository repository;

    @Autowired
    public TaskServiceImpl(TasksRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Task> list() {
        return repository.findAll();
    }

    public Task save(Task newTask) {
        return repository.save(newTask);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
