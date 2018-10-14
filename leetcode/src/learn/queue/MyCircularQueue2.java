package learn.queue;

class MyCircularQueue2 {
    private int[] queue;
    private int head = -1;
    private int tail = -1;
    private int size;
    
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue2(int k) {
        size = k;
        queue = new int[size];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        head = head == -1 ? 0 : head;
        
        tail = tail + 1 == size ? 0 : tail + 1;
        queue[tail] = value;
        
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        
        //last element
        if (head == tail) {
            head = -1;
            tail = -1;
        }
        else {
            head = head + 1 == size ? 0 : head + 1;
        }
        
        return true;
    }
    
    /** Get the front item from the queue. */
    public int front() {
        if (isEmpty()) {
        	return -1;
        }
        
        return queue[head];
    }
    
    /** Get the last item from the queue. */
    public int rear() {
        if (isEmpty()) {
        	return -1;
        }
        
        return queue[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
    	return head == -1 && tail == -1;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return head == (tail + 1) % size;
    }
}