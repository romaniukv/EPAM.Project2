package com.epam.project2;

import com.epam.project2.controller.Runner;
import com.epam.project2.model.TextTasks;
import com.epam.project2.view.Viewer;

public class Main {

    public static void main(String[] args) {
        new Runner(new TextTasks(), new Viewer()).run();
    }
}
