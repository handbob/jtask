package jtask.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class JTaskApi {
    @GetMapping("/")
    public String get() {
        return "Hello from Java!";
    }
}
