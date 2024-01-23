package textbook;

//Brendon Wolfe and Joseph Bozowski

public class packetSelector {
	
	static StackWork packets = null;//new StackWork(0, 0, 0);
	// Define packets, and initialize it to null.
	
	public static void main(String[] args) {
		
		System.out.println("Packet selector is now running...");
		
		packets = new StackWork(10, 10, 10);
		
		packets.Push(95, 0);
		packets.Push(103, 0);
		packets.Push(81, 0);
		packets.Push(120, 0);
		packets.Push(74, 0);
		packets.Push(134, 0);
		packets.Push(62, 0);
		packets.Push(101, 0);
		packets.Push(59, 0);
		packets.Push(148, 0);
		
		packets.displayStackData();
		
		reorganizeNetworkTraffic();
		
		packets.displayStackData();
		
	}
	
	
	// Precondition: The StackWork object packets is different than null.
	// Postcondition: The elements of the stack S0 that are equal to, or less than 100, are inserted in the stack S1.
	// The elements of the stack S0 that are greater than 100 are inserted in the stack S2.
	public static void reorganizeNetworkTraffic()   
	{
		int temp;
		int val = 0;
	    temp = packets.getS0top();
	    for(int i = 0; i <= temp; i++) {
	    	val = packets.Pop(0);
	    		if(val <= 100) {
	    			packets.Push(val, 1);
	    		} else if(val > 100){
	    			packets.Push(val, 2);
	    		}
	    }
	    
	} 
	
}       

