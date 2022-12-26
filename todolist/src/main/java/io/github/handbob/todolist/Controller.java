package io.github.handbob.todolist;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class Controller {
    Todo todo = new Todo();
    Database database = new Database();
    ArrayList<Todo> arrayList = new ArrayList<Todo>();
    Random random = new Random();
    int id = 0;

    @GetMapping("/allitem")
	ArrayList<Todo> getAllItem() {
        return arrayList;
	}

    @GetMapping("/doneitem")
    void getDoneItem() {
        
    }

    @GetMapping("/item/{id}")
    void getItemById() {

    }

    @PostMapping("/item")
    Todo newItemById() {
        todo.id = id = id + 1;
        todo.name = database.todo[random.nextInt(database.todo.length)];
        todo.isDone = random.nextBoolean();
        arrayList.add(todo);
        return todo;
    }

    @PutMapping("/item/{id}")
    void changeItemById() {

    }

    @DeleteMapping("/item/{id}")
    void delteItemById() {

    }
}
