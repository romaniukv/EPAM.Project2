package com.epam.project2.controller;

import com.epam.project2.model.TextTasks;
import com.epam.project2.model.entities.Letter;
import com.epam.project2.model.entities.Text;
import com.epam.project2.utils.InputUtils;
import com.epam.project2.view.Viewer;

public class Runner {

    private TextTasks textTasks;
    private Viewer viewer;

    public Runner(TextTasks textTasks, Viewer viewer) {
        this.textTasks = textTasks;
        this.viewer = viewer;
    }

    public void run() {
        int key = 0;
        while (key != 2) {
            viewer.printString(Viewer.MENU);
            key = InputUtils.inputMenuKey();
            switch (key) {
                case 1:
                    viewer.printString(Viewer.INPUT_TEXT);
                    textTasks.setText(new Text(InputUtils.inputText()));
                    viewer.printString(Viewer.INPUT_LETTER);
                    textTasks.setLetter(new Letter(InputUtils.inputLetter()));
                    System.out.println(textTasks.sortByLetterCount());
                    break;
                case 2:
                    break;
                default:
                    viewer.printString(Viewer.INPUT_ERROR);
            }
        }
    }
}
