package jtask.data;

import jakarta.persistence.*;

@Entity
@Table(name = "jtask")
public class JTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String task;
    private boolean done;

    public JTask() {}
    public JTask(String task, boolean done) { this.task = task; this.done = done; }
    
    public Long getId() { return this.id; }
    public String getTask() { return this.task; }
    public boolean getDone() { return done; }
}
