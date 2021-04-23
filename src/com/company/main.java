package com.company;

import java.time.LocalDateTime;

 public class main {
//   public static void main(String[] args) {Task task1 = new Task("Task1", "Pierwszy task", Task.Categories.NEW,
//           LocalDateTime.of (2021, 4, 21, 21, 12, 10));
//     Task task2 = new Task("Task2", "Drugi task", Task.Categories.DONE,
//           LocalDateTime.now());
// Task task3 = new Task("Task3", "Trzeci task", Task.Categories.IN_PROGRESS,
//         LocalDateTime.of(2021, 3, 27, 19, 57, 10));
//  System.out.println(task1);
// System.out.println(task2);
// System.out.println(task3);


//   Task task4 = new Task("Task4", "Czwarty task", Task.Categories.IN_PROGRESS,
//      LocalDateTime.of(2021, 3, 27, 19, 57, 10));

// LocalDateTime newTask4DatetimeStop = task4.getTaskDateTimeStop().plusMonths(3);
//    task4.setTaskDateTimeStop(newTask4DatetimeStop);
//    System.out.println(task4);
// System.out.println("--------------------------------------------------------------");


// Task[] taskArray = {task1, task2, task3, task4};
// for (Task t: taskArray) {
//   System.out.println(t);
//        }

         /// Cwiczenia 2
        Task subtask1 = new Subtask( "Task1", "pierwszy task", Task.Categories.DONE,
          LocalDateTime.now(), "Subtask1");
        Task subtask2 = new Subtask();
        Task subtask3 = new Subtask();
        Task task1 = new Task("Task4", "Czwarty task", Task.Categories.IN_PROGRESS,
                 LocalDateTime.of(2021, 3, 27, 19, 57, 10)));
        Task task2 = new Task();
        Task task3 = new Task();

        /// Cwiczenia 3
         Object subtask4 = new Subtask( "Task1", "pierwszy task", Task.Categories.DONE,
                LocalDateTime.now(), "Subtask1");
         Object subtask5 = new Subtask();
         Object subtask6 = new Subtask();
         Object task4 = new Task("Task4", "Czwarty task", Task.Categories.IN_PROGRESS,
                 LocalDateTime.of(2021, 3, 27, 19, 57, 10)));
         Object task5 = new Task();
         Object task6 = new Task();

        subtask1.toString();


    }
}
