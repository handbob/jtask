package jtask.controller;

import jtask.data.*;
import jtask.repository.*;
import io.swagger.v3.oas.annotations.tags.*;
import org.springframework.web.bind.annotation.*;

@Tag(name = "JTask")
@RestController
@RequestMapping("/api/v1")
public class JTaskController {
  private final JTaskRepository jTaskRepository;

  public JTaskController(JTaskRepository jTaskRepository) {
    this.jTaskRepository = jTaskRepository;
  }

  @GetMapping("/jtask-list")
  public Iterable<JTask> findAllJTasks() {
    return this.jTaskRepository.findAll();
  }

  @PostMapping("/jtask-new")
  public void addOneJTask(@RequestBody JTask jTask) {
    this.jTaskRepository.save(jTask);
  }
}
