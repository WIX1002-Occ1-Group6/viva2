import java.util.Scanner;
import java.util.Stack; 

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Expression: ");
        String expression = scanner.nextLine();
        
        boolean isBalanced = checkBracketBalance(expression);
        if (isBalanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        scanner.close();
    }
    
    private static boolean checkBracketBalance(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c); 
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty(); 
    }
}
