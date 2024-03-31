package jtask.jcontroller;

import jtask.jdata.*;
import jtask.jrepository.*;
import io.swagger.v3.oas.annotations.tags.*;
import org.springframework.web.bind.annotation.*;

@Tag(name = "JTask")
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class JController {
  private final JRepository jRepository;

  public JController(JRepository jRepository) {
    this.jRepository = jRepository;
  }

  @GetMapping("/jtask-list")
  public Iterable<JData> findAllJTasks() {
    return this.jRepository.findAll();
  }

  @PostMapping("/jtask-new")
  public void addOneJTask(@RequestBody JData jData) {
    this.jRepository.save(jData);
  }
}
