public class Queue <T> {
    private final T[] m_data;
    private final int m_capacity;
    private int m_front;
    private int m_rear;
    

    public Queue(final int size){
        m_data = (T[])new Object[size];
        m_capacity = size;
        m_front = -1;
        m_rear = -1;
    }

    public void enQueue(T data){
        if(isFull()){
            System.out.println("Queue is full, please reset the queue.");
            return;
        }

        if(m_front == -1)
            m_front = 0;
        
        m_data[++m_rear] = data;
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        m_data[m_front++] = null;
        
        if(m_front == m_capacity){
            // Reset the queue.
            m_front = -1;
            m_rear = -1;
        }
    }

    public boolean isFull(){
        return m_rear == m_capacity-1;
    }

    public boolean isEmpty(){
        return m_rear == -1;
    }

    public String getAll(){
        String result = "[ ";
        for (T t : m_data) {
            if(t == null)
                result += "Φ ";            
            else
                result += t + " ";
        }

        return result + "]";
    }

    public void traceAll(){
        System.out.println(getAll());
    }
}
