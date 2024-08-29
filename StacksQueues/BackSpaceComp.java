package StacksQueues;

import java.util.Stack;

public class BackSpaceComp {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c != '#') {
                stack.append(c);
            } else if (stack.length() > 0) {
                stack.deleteCharAt(stack.length() - 1);
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        BackSpaceComp bsc = new BackSpaceComp();
        String s1 = "ab#c";
        String t1 = "ad#c";
        System.out.println(bsc.backspaceCompare(s1, t1));
        String s2 = "ab##";
        String t2 = "c#d#";
        System.out.println(bsc.backspaceCompare(s2, t2));

    }

}
