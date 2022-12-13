package io.github.handbob.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main {
	@GetMapping("/")
	String welcomeMessage() {
		return "Hello from Rest API.";
	}

	@GetMapping("/items")
	void getItemList() {
  
	}

	@GetMapping("/items/{id}")
	void getItem() {
  
	}
  
	@PostMapping("/items/{id}")
	void createNewItem() {
		
	}
  
	@PutMapping("/items/{id}")
	void changeItem() {
  
	}
  
	@DeleteMapping("/items/{id}")
	void deleteItem() {
  
	}
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
