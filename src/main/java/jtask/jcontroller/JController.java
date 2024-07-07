package jtask.jcontroller;

import jtask.jdata.*;
import jtask.jrepository.*;
import io.swagger.v3.oas.annotations.tags.*;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Tag(name = "JTask")
@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class JController {
    private final JRepository jRepository;

    public JController(JRepository jRepository) {
        this.jRepository = jRepository;
    }

    @GetMapping("/welcome-message")
    public Object getWelcomeMessage() {
        return new JWelcomeMessage("Hello from Java and Spring!");
    }

    @GetMapping("/random-number")
    public Object randomString() {
      return new JRandomNumber(new Random().nextInt());
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
