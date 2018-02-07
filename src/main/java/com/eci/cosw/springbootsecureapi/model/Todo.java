package com.eci.cosw.springbootsecureapi.model;

/**
 * Created by laura on 6/02/2018.
 */
public class Todo {

    private String description;

    private int priority;

    private boolean completed;
    public Todo()
    {
    }

    public Todo( String description, int priority, boolean completed)
    {
        this.description = description;
        this.priority= priority;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}