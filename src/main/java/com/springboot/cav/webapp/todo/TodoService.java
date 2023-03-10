package com.springboot.cav.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "CAV", "Learn Spring", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "CAV", "Learn Spring Boot", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "CAV", "Learn MongoDB", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(4, "CAV", "Learn JavaScript", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(5, "CAV", "Learn React", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

}
