public class Stack<T> {
    private final T[] m_data;
    private final int m_capacity;
    private int m_top;

    public Stack(final int size){

        this.m_data = (T[]) new Object[size];
        this.m_capacity = size;
        this.m_top = -1;
    }

    public void push(T data){
        if(isFull()){
            System.out.println("Can't add a new item because the maximum size of the stack is " + m_capacity + " ! ");
            return;
        }
        m_data[++m_top] = data;
    }

    public void pop(){
        m_data[m_top--] = null;
    }

    public T get(int index){
        try {
            if(m_data[index] == null){
                System.out.println("Element must be deleted or not added yet!");
                // return m_data[m_top];
                return null;
            }
        } catch (Exception e) {
            System.out.println("Please don't get outside of the range!");
            return null;
        }

        return m_data[index];
    }

    public boolean isFull(){
        return m_top == m_capacity-1; 
    }

    public boolean isEmpty(){
        return m_top == 0;
    }

    public T peek(){
        return m_data[m_top];
    }

    public void display(){
        String result = "[ ";
        for (T t : m_data) {
            result += t + " ";
        }
        result += "]";
        System.out.println(result);
    }
}
