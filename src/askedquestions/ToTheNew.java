package askedquestions;

import java.util.Stack;

public class ToTheNew {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate over each character in the string
        for (char ch : s.toCharArray()) {
            // If stack is not empty and the top of the stack is the same as the current character
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // Remove the adjacent duplicate
            } else {
                stack.push(ch); // Otherwise, add the character to the stack
            }
        }
        
        // Build the final string from the stack
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "abbaca";
        System.out.println("Output: " + removeDuplicates(s1)); // Output: "ca"
        
        // Example 2
        String s2 = "azxxzy";
        System.out.println("Output: " + removeDuplicates(s2)); // Output: "ay"
    }
}
