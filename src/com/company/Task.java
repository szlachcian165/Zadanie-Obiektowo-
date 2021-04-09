
package com.company;
import java.time.LocalDateTime;



public class Task {

    private String taskName;
    private String taskDescription;
    private Categories taskCategory;



    enum Categories{
        NEW,
        IN_PROGRESS,
        DONE,
    }
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;



    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Categories getTaskCategory() {
        return taskCategory;
    }

    public Task(String taskName, String taskDescription, Categories taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;

        this.taskDateTimeStart = LocalDateTime.now();
    }



    public void setTaskCategory(Categories taskCategory) {
        this.taskCategory = taskCategory;
    }

    public LocalDateTime getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public void setTaskDateTimeStart(LocalDateTime taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public LocalDateTime getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskDateTimeStop(LocalDateTime taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskCategory='" + taskCategory + '\'' +
                ", taskDateTimeStart=" + taskDateTimeStart +
                ", taskDateTimeStop=" + taskDateTimeStop +
                '}';
    }
}
