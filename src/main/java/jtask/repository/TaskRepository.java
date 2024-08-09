package jtask.repository;

import jtask.data.*;
import org.springframework.data.repository.*;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
