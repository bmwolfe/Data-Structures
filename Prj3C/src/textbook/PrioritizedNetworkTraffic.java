package textbook;

//Brendon Wolfe and Joseph Bozowski

public class PrioritizedNetworkTraffic {
	private int[] Q;

	private int head = -1;
	private int tail = 0;
	private int length;
	
	// Precondition: Priority queue Q is defined but not created.
	// Postcondition: Priority queue Q is created, and its size is set to "queueSize".
	//                All values of Q are initialized to -1.
	//                length is set to "queueSize".
	public PrioritizedNetworkTraffic(int queueSize)
	{
		length = queueSize;
	    Q = new int[queueSize];
	    for(int x = 0; x != length; x++) {
	    	Q[x] = -1;
	    }
	}
	
	
	// Precondition: Priority queue Q is existent.
	//               "tail" is already set to the index of Q where a new packet may be inserted. 
	//               "head" is already set to the index of Q where the packet with the highest priority is stored.
	// Postcondition: A new packet with priority "newElement" is inserted in the priority queue Q.
	//                "head" is set to the index of Q where the packet with the highest priority is stored.
	//                "tail" is set to the next index of Q that is available for storage of a new element.
	//                If Q is full, "tail" is to the index of Q where the packet with the lowest priority is stored.
	public void Enqueue(int newElement)
	{	   
		int x;
		int lowPri = 99999;
		int lowPriInd = 0;
		
		
		for(x = 0; x != length; x++) {
			if(Q[x] < lowPri) {
				lowPri = Q[x];
				lowPriInd = x;
			}
			
			if(Q[x] > head) {
				head = Q[x];
			}
			
			if(Q[x] < tail) {
				tail = Q[x];
			}
		}
		
		Q[lowPriInd] = newElement;
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("At Enqueue: inserted "+ newElement +" in index " + lowPriInd);
		System.out.println("---------------------------------------------------");
		
	}

	
	// Precondition: Priority queue Q is existent.
	//               "head" is already set to the index of Q where the packet with the highest priority is stored.
	//               If Q is empty, "head" is -1.
	//               "tail" is already set to the index of Q where a new packet may be inserted.
	// Postcondition: The packet with index equal to "head" is removed from Q and is returned to the caller.
	//                -1 is inserted in its place, namely in the cell of Q where the removed packet was previously stored. 
    //                "head" is set to the index of Q where the packet with the highest priority is stored.
    //                "tail" is set to the next index of Q that is available for storage of a new element.
    //                If Q is empty, "head" is set to -1 and "tail" is set to 0. 
	
	public int Dequeue()
	{	   
		int element = 0;
		int hiPriInd = 0;
	    
	    if (head == -1) {
	    	throw new java.util.NoSuchElementException();
	    } else {
	    	for(int i = 0; i < length; i++) {
	    		if(Q[i] == head) {
	    			element = head;
	    			hiPriInd = i;
	    			Q[i] = -1;
	    		}
	    	}
	    }
	    
	    System.out.println("---------------------------------------------------");
		System.out.println("At Dequeue: removed "+ element +" from index " + hiPriInd);
		System.out.println("---------------------------------------------------");
	    
	    return element;
	}
	
	// Precondition: Priority queue Q is existent.
	//               "startIndex" and "endIndex" are indices of Q that define the beginning and the end, respectively, of the subarray of Q that needs to be searched.
	//               "startIndex" and "endIndex" may refer to the entire Q. 
	// Postcondition: The index of Q, where the packet with the highest priority is stored, is found and is returned to the caller. 
	public int LocateNextHead(int startIndex, int endIndex)
	{	   
		int pri = -1;
		int priPos = 0;
		for(int x = startIndex; x != endIndex; x++) {
			if(Q[x] > pri) {
			pri = Q[x];
			priPos = x;
			}
		}
		
		if(pri == -1) {
			priPos = -1;
		}
		return priPos;
	}
	
	
	// Precondition: Priority queue Q is existent.
	//               "startIndex" and "endIndex" are indices of Q that define the beginning and the end, respectively, of the subarray of Q that needs to be searched.
	//               "startIndex" and "endIndex" may refer to the entire Q. 
	// Postcondition: The index of Q, where the packet with the lowest priority is stored, is found and is returned to the caller. 
	
		
	
	public int LocateNextTail(int startIndex, int endIndex)
	{	   
		int pri = Integer.MAX_VALUE;
		int lowPos = 0;
		for(int x = startIndex; x != endIndex; x++) {
			if(Q[x] < pri) {
				pri = Q[x];
				lowPos = x;
			}
		}
		
		
		
		return lowPos;
	}
	
	
	// Precondition: Priority queue Q is existent. 
	// Postcondition: The index and priority of each packet in Q are displayed on the monitor.
	public void DisplayPriorityQueue()
	{
		System.out.println("Displaying priority queue data...\n");
		
			 
	     for (int i = 0; i != length; i++) {
	    	 
	    	 System.out.println("Index " + i + " Packet Priority "+ Q[i] + "\n");
	     }
	     
	     System.out.println("Current Head: " + LocateNextHead(0, length) + "; Current Tail: " + LocateNextTail(0, length));
	}
	
}
