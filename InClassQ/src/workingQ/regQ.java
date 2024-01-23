package workingQ;

public class regQ {
private int[] Q;
	
	private int head, tail, length;
	
	public regQ(int headVal, int tailVal, int lengthVal) {
		Q = new int[lengthVal];
		
		head = headVal;
		tail = tailVal;
		length = lengthVal;
	}
	

	public void Enqueue(int newElement) {
		System.out.println("This is the Enqueue method.\n");
		
		System.out.println("The current head is: " + head + " ; and the current tail is: " + tail + "\n");
		
		System.out.println("I am inserting: " + newElement + "\n");
		
		if (tail == head)
			if (tail == length -1)
				head = 0;
			else
				head++; 
		
		Q[tail] = newElement;
		
		if (tail == length - 1) {
			tail = 0;
		} else
			tail++;
		
		if (head == -1)
			head = 0;
		
		System.out.println("After the Enqueue, the current head is: " + head + " ; and the current tail is: " + tail + "\n");
	}

	
	public int Dequeue() {
	    int element = 0;
	    
	    if (head == -1)
	    	throw new java.util.NoSuchElementException();
	    
	    element = Q[head];
	    
	    if (head == (length - 1))
	    	head = 0;
	    else
	        head++;
	    
	    if (head == tail) {
	    	tail = 0;
	    	head = -1;
	    }
	    
	    return element;
	}	
	
	
	public void printQueueData() {
		 if (head == -1) {
			 System.out.println("Hey, the queue is empty\n");
			 
			 return;
		 }
			 
	     for (int i = head; i != tail; i++) {
	    	 
	    	 i = i % length;
	    	 
	    	 System.out.print(" " + Q[i]);
	     }
	}	
}

