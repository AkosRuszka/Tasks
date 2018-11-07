package com.akosruszka.tasks;

import com.akosruszka.tasks.domain.Task;
import com.akosruszka.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L,"Create Spring Boot Application", LocalDate.now(), true));
            taskService.save(new Task(2L,"Lemenni ebédért", LocalDate.now(), false));
            taskService.save(new Task(3L,"Bemenni gyakorlatra", LocalDate.now(), true));
        };
    }
}
