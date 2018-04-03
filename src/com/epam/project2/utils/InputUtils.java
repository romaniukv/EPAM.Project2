package com.epam.project2.utils;

import java.util.Scanner;

public class InputUtils {

    private static Scanner in = new Scanner(System.in);

    public static String inputText(String msg) {
        System.out.println(msg);
        String text = in.nextLine();
        return text;
    }
}
