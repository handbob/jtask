package jtask.api;

import jtask.data.JTaskObject;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JTaskApi {
    ArrayList<JTaskObject> jTaskList = new ArrayList<JTaskObject>();

	@GetMapping("/task")
	public ArrayList<JTaskObject> getTask() {
		return jTaskList;
	}

	@PostMapping("/task")
	public void postTask(@RequestBody JTaskObject jTask) {
		jTaskList.add(jTask);
	}

	@PutMapping("/task")
	public void putTask(@RequestBody JTaskObject jTask) {
		for (int i = 0; i < jTaskList.size(); i = i + 1) {
			if (jTaskList.get(i).getTaskName().equals(jTask.getTaskName())) {
				jTaskList.set(i, jTask);
			}
		}
	}

	@DeleteMapping("/task")
	public void deleteTask(@RequestBody JTaskObject jTask) {
		for (int i = 0; i < jTaskList.size(); i = i + 1) {
			if (jTaskList.get(i).getTaskName().equals(jTask.getTaskName())) {
				jTaskList.remove(i);
			}
		}
	}
}
