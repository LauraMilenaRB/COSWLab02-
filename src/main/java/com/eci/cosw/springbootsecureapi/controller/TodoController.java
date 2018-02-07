package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.List;

/**
 * Created by laura on 7/02/2018.
 */
@RestController
@RequestMapping( "api" )
public class TodoController {
    @Autowired
    private TodoService todo;

    @RequestMapping( value = "/todo", method = RequestMethod.GET)
    public List<Todo> getTodo() throws Exception{
        return todo.getTodoList();
    }

    @RequestMapping( value = "/newtodo", method = RequestMethod.POST )
    public Todo addtodo( @RequestBody Todo t ) throws ServletException {
        todo.addTodo(t);
        return t;
    }

}

