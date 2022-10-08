import java.util.HashMap;
import java.util.Scanner;

public class Balance {
    public static boolean isBalance(String text){
        Stack<Character> stack = new Stack<>(100);
        HashMap<Character, Character> translate = new HashMap<>();
        translate.put('(', ')');
        translate.put('{', '}');
        translate.put('[', ']');

        for (Character c : text.toCharArray()) {        
            if(c == '(' || c == '{' || c=='[')
                stack.push(c);
            else if(translate.get(stack.peek()) == c &&( c == ')' || c == '}' || c == ']')){
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // imagine we have a math's equation.
        //  we have to check that parentheses are balanced.
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println(isBalance(text));

    }
}
