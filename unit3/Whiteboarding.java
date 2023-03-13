import java.util.ArrayList;
import java.util.Arrays;

public class Whiteboarding {

    public static void main(String[] args) {
        // System.out.println("Hello!");

        // ArrayList<Integer> arrayList = new ArrayList<>(2,7,11,15);
        // int target = 9;
        // // twoSumIndicies(arrayList, target);
    }

    // 3-7-23
    // n   = 0 1  2  3    4      5 
    // seq = 1 11 21 1211 111221 312211
    public int seeAndSay(int n) {
        ArrayList<Integer> sequences = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                sequences.add(1);
            } else if (i > 0) {
                // map previous sequence to next sequence
                // e.g. map 1 to 11, 11 to 21, 21 to 1211
            }
        }
        return 0;
    }

    /*
     *  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
            2 <= nums.length <= 104
            -109 <= nums[i] <= 109
            -109 <= target <= 109
            Only one valid answer exists.

        
        Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */
    // public void twoSumIndicies(ArrayList arrayList, Int target) {
    //     // for (int i = 0; i < arrayList.length(); i++) {
            
    //     // }
    // }

    
}

