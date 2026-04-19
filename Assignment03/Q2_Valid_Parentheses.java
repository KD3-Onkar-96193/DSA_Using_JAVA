import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q2_Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();

        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        for (char c : s.toCharArray()) {

            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Q2_Valid_Parentheses obj = new Q2_Valid_Parentheses();
        String k = "(){}[]";

        boolean res = obj.isValid(k);

        System.out.println(res);

    }

}
