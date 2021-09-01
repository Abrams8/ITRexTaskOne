package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Text: ");
        String text = in.nextLine();
        String originalText = text;

        //task1
        text = Function.removeC(text);
        System.out.println(text);

        //task2
        text = Function.removeDoubleLetter(text);
        System.out.println(text);

        //task3
        text = Function.removeEAtTheEnd(text);
        System.out.println(text);

        //task4
        originalText = Function.removeArticles(originalText);
        originalText = Function.removeC(originalText);
        originalText = Function.removeDoubleLetter(originalText);
        originalText = Function.removeEAtTheEnd(originalText);
        System.out.println(originalText);
    }
}
