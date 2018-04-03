package com.epam.project2;

import com.epam.project2.model.TextTasks;
import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Text;
import com.epam.project2.utils.InputUtils;

public class Main {

    public static void main(String[] args) {
        TextTasks textTasks = new TextTasks(new Text(InputUtils.inputText("Input text:")), new Letter('g'));
        textTasks.sortByLetterCount();
    }
}
