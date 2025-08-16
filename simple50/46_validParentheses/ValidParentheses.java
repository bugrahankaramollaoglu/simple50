import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String s) {

        if (s.length() % 2 == 1) return false;
        
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
                stack.push(arr[i]);
            else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                if (
                    (arr[i] == ')' && top != '(') ||

                    (arr[i] == '}' && top != '{') ||

                    (arr[i] == ']' && top != '[') 
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
        
    }
    public static void main(String[] args) {
        System.out.println(validParentheses("[({})]")); // true
        System.out.println(validParentheses("[(])"));   // false
        System.out.println(validParentheses("()[]{}")); // true
    }
}