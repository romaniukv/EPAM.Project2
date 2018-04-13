package com.epam.project2.view;

public class Viewer {

    public static final String MENU = "********************************Меню****************************\n" +
                                      "1. Отсортировать слова в тексте по убыванию количества вхождений\n" +
                                      "заданного символа, а в случае равенства – по алфавиту.\n" +
                                      "2. Выход.\n" +
                                      "******************************************************************";
    public static final String INPUT_TEXT = "Введите текст:";
    public static final String INPUT_LETTER = "Введите символ:";
    public static final String INPUT_ERROR = "Ошибка ввода! Попробуйте ещё раз:";
    public static final String SORT_RESULT = "Результат сортировки:";

    public void printString(String string) {
        System.out.println(string);
    }
}
