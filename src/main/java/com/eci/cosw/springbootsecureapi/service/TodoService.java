package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;

import java.util.List;

/**
 * Created by laura on 7/02/2018.
 */
public interface TodoService {

    public List<Todo> getTodoList();

    void addTodo(Todo t);
}
