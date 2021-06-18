/**
 * Given an encoded string, return its decoded string.
 *
 * <p>The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
 * is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * <p>You may assume that the input string is always valid; No extra white spaces, square brackets
 * are well-formed, etc.
 *
 * <p>Furthermore, you may assume that the original data does not contain any digits and that digits
 * are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 */
package string;

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        // keep 2 stacks -> one to store freq (st1), other to store string (st2)
        // when encounter a number, get the whole number to store in numStack.
        // when encounter [ , initialize a string and then start appending to the initialized string
        // if encounter ], pop number stored in stack and pop the string in the string stack and
        // append to the current string as popped + current accumulated string

        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuffer sb;
        String res = "";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                int finalNum = 0;
                while (Character.isDigit(s.charAt(i))) {
                    finalNum = 10 * finalNum + (s.charAt(i) - '0');
                    i++;
                }

                numStack.push(finalNum);
                i--;

            } else if (s.charAt(i) == '[') {
                strStack.push(res);
                res = "";
            } else if (s.charAt(i) == ']') {

                sb = new StringBuffer(strStack.pop());
                int freq = numStack.pop();
                for (int j = 0; j < freq; j++) {
                    sb.append(res);
                }

                res = sb.toString();

            } else {
                res += s.charAt(i);
            }
        }

        return res;
    }
}
