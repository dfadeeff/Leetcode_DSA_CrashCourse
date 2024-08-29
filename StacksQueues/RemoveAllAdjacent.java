package StacksQueues;

public class RemoveAllAdjacent {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }


    public static void main(String[] args) {
        RemoveAllAdjacent removeAllAdjacent = new RemoveAllAdjacent();
        String s1 = "abbaca";
        System.out.println(removeAllAdjacent.removeDuplicates(s1));
        String s2 = "azxxzy";
        System.out.println(removeAllAdjacent.removeDuplicates(s2));
    }

}
