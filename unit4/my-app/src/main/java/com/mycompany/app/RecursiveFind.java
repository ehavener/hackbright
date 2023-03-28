package com.mycompany.app;

import java.util.Arrays;

public class RecursiveFind {
    public static int recursiveFind(String term, String[] list) {
        if (list[0] == term) {
            return 1;
        } else if (list.length == 1) {
            return -1;
        } else {
            return recursiveFind(term, Arrays.copyOfRange(list, 1, list.length - 1));
        }
    }

    public static void main(String[] args) {
        String[] list = { "hey", "there", "you" };
        String term = "porcupine";
        System.out.println(recursiveFind(term, list));
    }
}
