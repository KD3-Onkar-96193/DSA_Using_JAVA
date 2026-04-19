
import java.util.Stack;

public class Q1_Postfix_Prefix_Evalution {

    public static double evaluatePostfix(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] str = expression.split(" ");

        for (String token : str) {

            
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
              
                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        return stack.pop();
    }

    public static double evaluatePrefix(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] str = expression.split(" ");

        // Traverse from RIGHT to LEFT
        for (int i = str.length - 1; i >= 0; i--) {
            String token = str[i];

            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {

                double a = stack.pop();
                double b = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        return stack.pop();
    }


    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expr = "22 8 4 * + 15 -";  

        double result = evaluatePostfix(expr);
        System.out.println("Postfix Result: " + result);

        String expr1 = "- + 22 * 8 4 15";

        double result1 = evaluatePrefix(expr1);
        System.out.println("Prefix Result: " + result1);
    }
}

