import java.util.LinkedList;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(2); // size of the stack is 2
        stack.push("Text 1");
        stack.push("Text 2");
        stack.push("Text 3"); // excpect to give error!
        stack.pop();
        stack.push("Newest data replaced to text 2 !");
        
        // Peek shows the last element (The most recent) stored in the queue.
        System.out.println(stack.peek()); 
    }   
}