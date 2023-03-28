package com.mycompany.app;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumber {
    public static int missingNumber(int[] numbers, int maxNum) {
        Arrays.sort(numbers);
        for (int i = 1; i <= maxNum; i++) {
            if (i != numbers[i-1]) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumberOn(int[] numbers, int maxNum) {
        Set<Object> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

        for (int i = 1; i <= maxNum; i += 1) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int missingNumberOnO1(int[] numbers, int maxNum) {
        int expectedSum = 0;
        for (int i = 1; i <= maxNum; i++) {
            expectedSum += i;
        }
        int actualSum = Arrays.stream(numbers).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int result = missingNumber(numbers, maxNum);
        System.out.println(result);

        int[] numbersOn = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNumOn = 10;
        int resultOn = missingNumberOn(numbersOn, maxNumOn);
        System.out.println(resultOn);

        int[] numbersOnO1 = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNumOnO1 = 10;
        int resultOnO1 = missingNumberOnO1(numbersOnO1, maxNumOnO1);
        System.out.println(resultOnO1);
    }
}
