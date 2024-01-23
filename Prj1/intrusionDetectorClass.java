package Prj1;

public class intrusionDetectorClass {

	public static void main(String[] args) {
		
		System.out.println("Prj1 is running.\n");
		
		IntNode head = new IntNode(1, null);
		
		head.addNodeInOrder(head, 2);
		head.addNodeInOrder(head, 3);
		head.addNodeInOrder(head, 4);
		head.addNodeInOrder(head, 5);
		head.addNodeInOrder(head, 6);
		head.addNodeInOrder(head, 248041794);
		head.addNodeInOrder(head, 8);
		head.addNodeInOrder(head, 9);
		head.addNodeInOrder(head, 230185386);
		head.addNodeInOrder(head, 11);
		head.addNodeInOrder(head, 12);
		
		//printed elements
		head.addNodeInOrder(head, 230185386);
		head.addNodeInOrder(head, 308329763);
		head.addNodeInOrder(head, 248041794);
		head.addNodeInOrder(head, 295106305);
		head.addNodeInOrder(head, 325615905);
		head.addNodeInOrder(head, 652976466);
		head.addNodeInOrder(head, 847897267);
		head.addNodeInOrder(head, 927847798);
		head.addNodeInOrder(head, 927847798);
		head.addNodeInOrder(head, 927847798);
		head.addNodeInOrder(head, 927847798);
		
		
		System.out.println("End of run.");
		

	}

}
