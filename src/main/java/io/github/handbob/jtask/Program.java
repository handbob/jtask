package io.github.handbob.jtasks;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class JTask {
	private String name;
	private boolean isDone;

	public JTask(String name, boolean isDone) {
		this.name = name;
		this.isDone = isDone;
	}

	public void setName(String name) {
		this.name = name;    
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}

	public String getName() {
		return name;
	}

	public boolean getIsDone() {
		return isDone;
	}
}

@RestController
@SpringBootApplication
public class Program {
	ArrayList<JTask> taskList = new ArrayList<JTask>();

	// Get a list of all tasks
	@GetMapping("/tasklist")
	public ArrayList<JTask> getTaskList() {
		for (JTask task : taskList) {
			System.out.println(task.getName() + " " + task.getIsDone());
		}
		return taskList;
	}

	// Add a new task
	@PostMapping("/task")
	public void postTask(@RequestBody JTask task) {
		System.out.println(task.getName() + " " + task.getIsDone());
		taskList.add(task);
	}

	// Update an existing task
	@PutMapping("/task")
	public void putTask(@RequestBody JTask task) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getName().equals(task.getName())) {
				taskList.set(i, task);
			}
		}
	}

	// Delete an existing task
	@DeleteMapping("/task")
	public void deleteTask(@RequestBody JTask task) {
		for (int i = 0; i < taskList.size(); i++) {
			if (taskList.get(i).getName().equals(task.getName())) {
				taskList.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}
}
