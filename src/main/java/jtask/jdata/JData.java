package jtask.jdata;

import jakarta.persistence.*;

@Entity
@Table(name = "jtask")
public class JData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final String task;
    private final boolean done;

    public JData(String task, boolean done) {
        this.task = task;
        this.done = done;
    }

    public Long getId() {
        return this.id;
    }

    public String getTask() {
        return this.task;
    }

    public boolean getDone() {
        return done;
    }
}
