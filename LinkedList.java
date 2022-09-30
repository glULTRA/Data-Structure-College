public class LinkedList<T> {
    static class Node<T> {
        public T m_data;
        public Node m_next;

        Node(T data){
            m_data = data;
            m_next = null;
        }
    }
    
 
    public Node head = null;
    
    private Node original_head = null;
    private int size = 0;
    private int trace_at = 0;
    private int original_size;
    
    LinkedList(){

    }

    public void insert(T data){
        head = insert(head, data);
        size++;
        original_head = head;
        original_size = size;
    }

    private Node insert(Node node,T data ){
        if(node == null){
            return new Node<T>(data);
        }else{
            node.m_next = insert(node.m_next, data);
            return node;
        }
    }

    public void delete(int index)
    {
        size--;
        head = delete(head, index);
        original_head = head;
        original_size = size;
    }

    private Node delete(Node node, int index){
        // EX: index = 2
        if(node == null) {
            System.out.println("Index out of the range !");
            size = original_size;
            return node;
        }

        if(index == 0){
            // Deleting the head !
            node = node.m_next;
            return node;
        }

        node.m_next = delete(node.m_next, index-1);
        return node;
    }

    public String traceNodes(){
        String result = "[ ";
        
        while(hasNext())
            result += head.m_data + " ";

        return result + "]";
    }

    public void display(){
        System.out.println(traceNodes());
    }

    public boolean hasNext(){
        // Iteration through each nodes.
        if(head == null || head.m_next == null){
            head = original_head;
            trace_at = 0;
            return false;
        }
        if(trace_at == 0){
            trace_at++;
            return true;
        }

        head = head.m_next;
        return true;
    }

    public int size(){
        return size;
    }
}
