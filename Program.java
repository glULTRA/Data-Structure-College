/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        // Stack example.
        System.out.println("<---------STACK--------->");
        Stack<String> stack = new Stack<String>(2); // size of the stack is 2
        stack.push("A");
        stack.push("B");
        stack.push("C"); // excpect to give error!
        stack.pop();
        stack.push("G");
        
        // Peek shows the last element (The most recent) stored in the queue.
        // System.out.println(stack.peek()); 
        stack.display();

        // Queue example.
        System.out.println("<---------QUEUE--------->");
        Queue<String> queue = new Queue<String>(5);
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.enQueue("D");
        queue.enQueue("E");
        queue.deQueue();
        queue.deQueue();
        queue.enQueue("F"); // Can't be added ! cause the queue is already full and needs to be reseted.
        queue.display();

        // LinkedList example.
        System.out.println("<---------LinkedList--------->");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.insert("A");
        linkedList.insert("B");
        linkedList.insert("C");
        linkedList.insert("B");
        linkedList.insert("A");
        linkedList.delete(2);
        linkedList.delete(2);


        linkedList.display();
        System.out.println(linkedList.size());
    }
}