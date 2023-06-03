package jtask.data;

public class JTaskObject {
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
