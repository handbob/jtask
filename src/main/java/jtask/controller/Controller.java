package jtask.controller;

import jtask.data.*;
import jtask.repository.*;
import io.swagger.v3.oas.annotations.tags.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Main")
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class Controller {
    private final TaskRepository taskRepository;

    public Controller(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/task-list")
    public ResponseEntity<Iterable<Task>> findAllTasks() {
        return new ResponseEntity<>(this.taskRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/task-new")
    public ResponseEntity<Object> addOneTask(@RequestBody Task task) {
        try {
            taskRepository.save(task);
            return new ResponseEntity<>("Task created successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to create task", HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/task-update/{id}")
    public ResponseEntity<String> updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskRepository.findById(id).map(existingTask -> {
            existingTask.setName(task.getName());
            existingTask.setDone(task.isDone());
            taskRepository.save(existingTask);
            return new ResponseEntity<>("Task updated successfully", HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>("Task not found", HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/task-delete/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable Long id) {
        return taskRepository.findById(id).map(task -> {
            taskRepository.delete(task);
            return new ResponseEntity<>("Task deleted successfully", HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>("Task not found", HttpStatus.NOT_FOUND));
    }
}
