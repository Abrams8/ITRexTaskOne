package com.company;

public class Function {

    public static String removeC(String text) {
        text = text.replaceAll("ci", "si");
        text = text.replaceAll("ce", "se");
        text = text.replaceAll("ck", "k");
        text = text.replaceAll("c", "k");
        return text;
    }

    public static String removeDoubleLetter(String text) {
        while (text.contains("ee") || text.contains("oo")) {
            text = text.replaceAll("ee", "i");
            text = text.replaceAll("oo", "u");
        }
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)) {
                text = text.substring(0, i) + text.substring(i + 1);
            }
        }
        return text;
    }

    public static String removeEAtTheEnd(String text) {
        char lastLetter = 'e';
        String[] words = text.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1 && words[i].charAt(words[i].length() - 1) == lastLetter) {
                words[i] = words[i].substring(0, words[i].length() - 1);
            }
        }
        text = "";
        for (int i = 0; i < words.length; i++) {
            text = text + words[i] + " ";
        }
        return text;
    }

    public static String removeArticles(String text) {
        text = text.replaceAll("\\ba\\b", "");
        text = text.replaceAll("\\ban\\b", "");
        text = text.replaceAll("\\bthe\\b", "");
        return text;
    }
}
