/**
 * Given a string s of '(' , ')' and lowercase English characters.
 *
 * <p>Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so
 * that the resulting parentheses string is valid and return any valid string.
 *
 * <p>Formally, a parentheses string is valid if and only if:
 *
 * <p>It is the empty string, contains only lowercase characters, or It can be written as AB (A
 * concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a
 * valid string.
 */
package string;

import java.util.Stack;

public class MinRemoveToValidParenthesis {

    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st = new Stack<>();
        char[] chArr = s.toCharArray();

        for (int i = 0; i < chArr.length; i++) {

            if (chArr[i] == '(' || chArr[i] == ')') {

                if (st.isEmpty() && chArr[i] == ')') {
                    chArr[i] = ' ';
                } else if (!st.isEmpty() && chArr[i] == ')') {
                    st.pop();
                } else {
                    st.push(i);
                }
            }
        }

        while (!st.isEmpty()) {
            chArr[st.pop()] = ' ';
        }

        return new String(chArr).replaceAll(" ", "");
    }

}
