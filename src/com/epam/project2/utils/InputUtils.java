package com.epam.project2.utils;

import com.epam.project2.view.Viewer;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static int inputMenuKey() {
        while (true) {
            String str = in.nextLine();
            if (str.matches(RegExUtils.MENU_KEY_REGEX))
                return Integer.valueOf(str);
            else
                System.out.println(Viewer.INPUT_ERROR);
        }
    }

    public static String inputText() {
        return in.nextLine();
    }

    public static char inputLetter() {
        while (true) {
            String str = in.nextLine();
            if (str.matches(RegExUtils.LETTER_REGEX))
                return str.charAt(0);
            else
                System.out.println(Viewer.INPUT_ERROR);
        }
    }
}
