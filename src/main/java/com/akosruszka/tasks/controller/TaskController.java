package com.akosruszka.tasks.controller;

import com.akosruszka.tasks.domain.Task;
import com.akosruszka.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService service;

    @Autowired
    public void setService(TaskService service) {
        this.service = service;
    }

    @GetMapping(value={"/",""})
    public Iterable<Task> list() {
        return service.list();
    }

    @PostMapping(value="/addnewTask")
    public Task addNewTask(@RequestBody Task t) {
        return service.save(t);
    }

    @DeleteMapping(value="/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        service.delete(id);
    }

}
