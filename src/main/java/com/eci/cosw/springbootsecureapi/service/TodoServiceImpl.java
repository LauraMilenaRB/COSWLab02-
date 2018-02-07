package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laura on 7/02/2018.
 */
@Service
public class TodoServiceImpl implements TodoService {
    private List<Todo> todos = new ArrayList<>();

    @Autowired
    public TodoServiceImpl(){
    }

    @Override
    public List<Todo> getTodoList() {
        return todos;
    }

    @Override
    public void addTodo(Todo todo) {
        todos.add(todo);
    }
}
