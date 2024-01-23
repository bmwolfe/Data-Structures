package workingQ;

public class centralQ {

	public static void main(String[] args) {
		regQ myQ = new regQ(-1, 0, 9);

		myQ.Enqueue(1);
		
		myQ.Enqueue(5);
		
		myQ.Enqueue(7);
		
		myQ.Enqueue(10);
		
		myQ.printQueueData();
		
		myQ.Dequeue();
		
		System.out.println("\n");
		
		myQ.printQueueData();
	}

}
