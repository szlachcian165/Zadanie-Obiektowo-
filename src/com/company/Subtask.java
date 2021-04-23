package com.company;

import java.time.LocalDateTime;

public class Subtask extends Task{

    public Subtask(){

    }
    public Subtask(String taskName, String taskDescription, Categories taskCategory, LocalDateTime taskDateTimeStop,String subtaskName) {
        super(taskName, taskDescription, taskCategory, taskDateTimeStop);
        this.subtaskName = subtaskName;
    }
    private String subtaskName;

    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    @Override
    public String toString() {
        return "Subtask{" +
                "subtaskName='" + subtaskName + '\'' +
                '}';
    }
}
