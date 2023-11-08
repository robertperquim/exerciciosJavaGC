package com.github.todoservice.controller;



import com.github.todoservice.model.Task;
import com.github.todoservice.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;



@RestController
@RequestMapping("/tasks")
public class TaskController {

      @Autowired
      TaskService taskService;

      @GetMapping
      public ResponseEntity<ArrayList<Task>> taskList(){
          return ResponseEntity.ok(taskService.listTasks());
      }

     @PostMapping("/add")
      public ResponseEntity<String> addTask(@RequestBody Task task){
            taskService.addTask(task);
            return ResponseEntity.ok("task added successfully");
     }

     @DeleteMapping("/delete/{id}")
      public ResponseEntity<String> deleteTask(@PathVariable (value = "id") int idRemove){
            taskService.removeTask(idRemove);
            return ResponseEntity.ok("task removed successfully");
     }

     @PutMapping("/edit/{id}")
      public ResponseEntity<String> editTask (@PathVariable (value = "id") int idEdit, @RequestBody Task taskUpdate){
            boolean editSucessfully = taskService.editTask(idEdit, taskUpdate);
            if (editSucessfully){
                  return ResponseEntity.ok("Task updated successfully");
            }
            return ResponseEntity.notFound().build();
     }


}

