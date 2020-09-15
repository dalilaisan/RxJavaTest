package com.example.dalila.rxjavatest;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Task> createTasksList() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Take out the trash",true,5 ));
        tasks.add(new Task("Walk the dog",false,4 ));
        tasks.add(new Task("Do homework",false,3 ));
        tasks.add(new Task("Unload the dishwasher",true,2 ));
        return tasks;
    }
}
