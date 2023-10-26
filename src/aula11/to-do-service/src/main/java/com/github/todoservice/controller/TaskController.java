package com.github.todoservice.controller;



import com.github.todoservice.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class TaskController {
  private List<Task> taskList = new ArrayList<>();

  //@GetMapping("/tasks")
 // public List<Task> taskList()


}

