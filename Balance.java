import java.util.HashMap;
import java.util.Scanner;

public class Balance {
    public static boolean isBalance(String text){
        Stack<Character> stack = new Stack<>(100);
        HashMap<Character, Character> appendable = new HashMap<>();
        appendable.put('(', '(');
        appendable.put('{', '{');
        appendable.put('[', '[');
        HashMap<Character, Character> removeable = new HashMap<>();
        removeable.put('(', ')');
        removeable.put('{', '}');
        removeable.put('[', ']');

        for (Character c : text.toCharArray()) {
            
            if(appendable.get(c) == c)
            stack.push(appendable.get(c));
            else if(removeable.get(stack.peek()) == c){
                System.out.println(stack.peek());
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // imagine we have a math's equation.
        //  we have to check that parantheness are balanced.
        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println(isBalance(text));

    }
}
