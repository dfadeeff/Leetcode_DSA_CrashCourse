package StacksQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {


    public boolean isValid(String s) {
        Map<Character, Character> matching = new HashMap();
        matching.put('(', ')');
        matching.put('[', ']');
        matching.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (matching.containsKey(c)) { // if c is an opening bracket
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }

                char previousOpening = stack.pop();
                if (matching.get(previousOpening) != c) {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParenthesis v = new ValidParenthesis();
        String s1 = "(]";
        System.out.println(v.isValid(s1));
        String s2 = "([])";
        System.out.println(v.isValid(s2));
    }
}

