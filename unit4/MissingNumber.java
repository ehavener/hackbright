import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class MissingNumber {

    // Part 1: Runtime
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
        Set<Integer> set = Arrays.stream(numbers).boxed().collect(Collectors.toSet());

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

    // Part 2: Data Structures
    public static boolean balancedParenthesis(String input) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (!s.empty() && s.peek() == '(') {
                    s.pop();
                } else {
                    return false;
                }
            } else if (input.charAt(i) == '(') {
                s.add('(');
            }
        }

        return s.isEmpty() ? true : false;
    }

    // Part 3: Data Structures and Algorithms Practice
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
        // Part 1: Runtime
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

        // Part 2: Data Structures
        String input = "(()))";
        System.out.println(balancedParenthesis(input));

        // Part 3: Data Structures and Algorithms Practice
        String[] list = { "hey", "there", "you" };
        String term = "porcupine";
        System.out.println(recursiveFind(term, list));
    }
}
