public class Whiteboarding2 {
    /*
    Given a string s, reverse the string according to the following rules:

    All the characters that are not English letters remain in the same position.
    All the English letters (lowercase or uppercase) should be reversed.

    Return s after reversing it.

        Example 1:

        Input: s = "ab-cd"
        Output: "dc-ba"

        Example 2:

        Input: s = "a-bC-dEf-ghIj"
        Output: "j-Ih-gfE-dCba"

        Example 3:

        Input: s = "Test1ng-Leet=code-Q!"
        Output: "Qedo1ct-eeLg=ntse-T!"

    Constraints:

        1 <= s.length <= 100
        s consists of characters with ASCII values in the range [33, 122].
        s does not contain '\"' or '\\'.
     */

        // reverse our string
        // loop through original string
        // if next char in original string is alphanumeric
        //   replace it with the top of the reversed string
        //   pop off top of reversed string


    /*
    In an alien language, surprisingly, they also use English lowercase letters, but possibly in a 
    different order. The order of the alphabet is some permutation of lowercase letters.

    Given a sequence of words written in the alien language, and the order of the alphabet, return 
    true if and only if the given words are sorted lexicographically in this alien language.

    Example 1:
    Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
    Output: true
    Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

    Example 2:
    Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
    Output: false
    Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

    Example 3:
    Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
    Output: false
    Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to 
    lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character
     */
        // compare each word with i+1 (for i...n-1)
        // for each character until position of last character in longer word
        //   if character of first word < character of next word
        //      continue
        //   else return false
        // return true
        // O(n*m)
    
    /*
    Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase 
    letters, the email may contain one or more '.' or '+'.

        For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.

    If you add periods '.' between some characters in the local name part of an email address, mail sent there 
    will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.

        For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.

    If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows 
    certain emails to be filtered. Note that this rule does not apply to domain names.

        For example, "m.y+name@email.com" will be forwarded to "my@email.com".

    It is possible to use both of these rules at the same time.

    Given an array of strings emails where we send one email to each emails[i], return the number of different 
    addresses that actually receive mails.

    Example 1:
        Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
        Output: 2
        Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.

    Example 2:
        Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
        Output: 3

    Constraints:
        1 <= emails.length <= 100
        1 <= emails[i].length <= 100
        emails[i] consist of lowercase English letters, '+', '.' and '@'.
        Each emails[i] contains exactly one '@' character.
        All local and domain names are non-empty.
        Local names do not start with a '+' character.
        Domain names end with the ".com" suffix.
     */

    // for each email address
    // remove all '.' characters before '@' and before '+'
    // remove all characters after and including '+' before '@'
    

    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.

    Example 1:
    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]

    Example 2:
    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]

    Constraints:
        2 <= nums.length <= 105
        -30 <= nums[i] <= 30
        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
     */

    // O(n^2)
    // set input[i] = 1 
    // take product of input[0]...input[n-1]
    // store value in output[i]
    
    // O(n)
    // for each number in input
    //  set input[i] equal to the product of all numbers

    public static int[] product(int[] input) {
        int[] output = new int[input.length];
        return output;
    }


    /*
        Given an integer array nums, find the subarray
        with the largest sum, and return its sum.

        Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        Example 2:
        Input: nums = [1]
        Output: 1
        Explanation: The subarray [1] has the largest sum 1.

        Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23
        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

        Constraints:
            1 <= nums.length <= 105
            -104 <= nums[i] <= 104
     */

    // start with an initial subarray index of i, and an initial subArraySum of input[0]
    //  find sums of all proceeding values
    // return maximum sum

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int[] output = product(input);
        System.out.println(output);
    }
}
