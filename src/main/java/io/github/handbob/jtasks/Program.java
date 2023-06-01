package io.github.handbob.jtasks;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.boot.SpringApplication;

class JTasks {
	private String taskName;
	private boolean isDone;

	public void setName(String taskName) {
		this.taskName = taskName;    
	}

	public String getTaskName() {
		return this.taskName;
	}

	public boolean getIsDone() {
		return this.isDone;
	}
}

@RestController
@SpringBootApplication
public class Program {
	ArrayList<JTasks> jTasksList = new ArrayList<JTasks>();

	@GetMapping("/tasklist")
	public ArrayList<JTasks> getTaskList() {
		return jTasksList;
	}

	@PostMapping("/task")
	public void postTask(@RequestBody JTasks jTask) {
		jTasksList.add(jTask);
	}

	@PutMapping("/task")
	public void putTask(@RequestBody JTasks jTask) {
		for (int i = 0; i < jTasksList.size(); i = i + 1) {
			if (jTasksList.get(i).getTaskName().equals(jTask.getTaskName())) {
				jTasksList.set(i, jTask);
			}
		}
	}

	@DeleteMapping("/task")
	public void deleteTask(@RequestBody JTasks jTask) {
		for (int i = 0; i < jTasksList.size(); i = i + 1) {
			if (jTasksList.get(i).getTaskName().equals(jTask.getTaskName())) {
				jTasksList.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Program.class, args);
	}
}
