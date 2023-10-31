package com.github.todoservice.service;


import com.github.todoservice.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {
    private final ArrayList<Task> taskList = new ArrayList<>();
    private final AtomicLong idIncrement = new AtomicLong(1);

    public ArrayList<Task> listTasks (){
        return taskList;
    }

    public void addTask (Task newTask){
        newTask.setId(idIncrement.getAndIncrement());
        taskList.add(newTask);
    }

    public void removeTask (int id){
        taskList.remove(id-1);
    }

    public boolean editTask (int id, Task taskUpdate){
        for (Task task : taskList){
            if (task.getId() == id){
                taskUpdate.setId((long) id);
                taskList.set(id -1, taskUpdate);
                return true;
            }
        }
        return false;
    }

}
