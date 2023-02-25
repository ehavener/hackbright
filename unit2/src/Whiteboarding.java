import java.util.ArrayList;
import java.util.Arrays;

public class Whiteboarding {

    public static void swap(ArrayList<Integer> inputList, int i, int j) {
        int temp = inputList.get(i);
        inputList.set(i, inputList.get(j));
        inputList.set(j, temp);
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (inputList.get(i) < inputList.get(j)) {
                    swap(inputList, i, j);
                }
            }
        }
        return inputList;
    }

    public static boolean doesSubstringExist(String string, String subString) {
        for (int i = 0; i < string.length() - subString.length(); i++) {
            if (string.charAt(i) == subString.charAt(0)) {
                if (string.substring(i, i + subString.length()).equals(subString)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<Character> caesarCipher(ArrayList<Character> inputList, int shiftAmount) {
        for (int i = 0; i < inputList.size(); i++) {
            int charAsInt = (int)inputList.get(i);
            // reduce looping shifts to an offset from 'a'
            if (shiftAmount >= 26) {
                shiftAmount = shiftAmount % 26;
            }
            int shiftedCharAsInt = charAsInt + shiftAmount;
            // wrap around if going past z ('a' is 97, 'z' is 122)
            if (shiftedCharAsInt > 122) {
                shiftedCharAsInt = 96 + shiftedCharAsInt - 122;
            }
            char shiftedChar = (char)shiftedCharAsInt;
            inputList.set(i, shiftedChar);
        }
        return inputList;
    }
    
    public static void main(String[] args) {
        // 1. Write a method that takes an array of integers as an argument, and returns the sorted array.
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 3, 1));
        ArrayList<Integer> output = bubbleSort(input);
        System.out.println(output);

        // 2. Write a method that takes two strings as arguments. The first is a phrase, and the second is a search term. 
        // return true if the search term appears in the phrase, and false otherwise. It should be case-sensitive.
        String subString = "needle";
        String string = "Find the needle in the haystack.";
        boolean found = doesSubstringExist(string, subString);
        System.out.println(found);

        // 3. Write a method that takes a string and integer as arguments, and performs Caesar cipher encoding on the 
        // string using the integer as a shift amount. Letters should be shifted down the alphabet, and wrap around if 
        // going past 'z'. You may assume fully alphabetic lower case input.
        ArrayList<Character> caesarCipherInput = new ArrayList<Character>(Arrays.asList('h', 'e', 'l', 'l', 'o', 'z'));
        int caesarCipherShiftAmount = 28;
        ArrayList<Character> caesarCipherOutput = caesarCipher(caesarCipherInput, caesarCipherShiftAmount);
        System.out.println(caesarCipherOutput);
    }
}
