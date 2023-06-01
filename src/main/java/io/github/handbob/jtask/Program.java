package io.github.handbob.jtask;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class TaskList {
	public int id;
	public String name;
	public String description;
	public boolean done;
}

@RestController
@SpringBootApplication
public class Program {
	ArrayList<TaskList> taskList = new ArrayList<TaskList>();

	@GetMapping("/tasklist")
	public ArrayList<TaskList> getTaskList() {
		return taskList;
	}

	// @GetMapping("/item/{id}")
	// public void getItemById(int id) {
	// 	return;
	// }

	@PostMapping("/task")
	public void postTask(@RequestBody TaskList task) {
		task.id = taskList.size();
		taskList.add(task);
	}

	// @PutMapping("/task")
	// public void putTask(@RequestBody TodoList task) {
	// 	todoList.set(task.id, task);
	// }

	@GetMapping("/task")
	public void deleteTask(@RequestBody TaskList task) {
		taskList.remove(task.id);
	}

	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}
}
