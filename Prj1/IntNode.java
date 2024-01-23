package Prj1;

public class IntNode {

	private int key;
	private int counter = 0;
	
	private IntNode nextNode;
	private IntNode head;
	private IntNode next;
	
	public IntNode(int key, IntNode nextNode) {
		   this.key = key;
		   this.nextNode = nextNode;
	}
	
	/*public IntNode() {
		if(counter == 0) {
		   head = new IntNode(key, null);
		   next = null;
		   head.setKey(key);
		   counter++;
		}
	}*/
	
	public void removeDuplicate(int key) {
		
		System.out.println("Running removeDuplicate() on target " + counter +"\n");
		counter--;
		
		if(this.nextNode != null) {
			this.nextNode = this.nextNode.nextNode;
			isEmpty();
		}
		
	}
	
	public void isEmpty() {
		
		if(getLength(getNext()) == 0)
			System.out.println("The linked list is empty\n");
	}
	
	public int getKey() {
		return this.key;
	}
	
	/*public int getKey(int nodePlace) {
		
		for(int i = 13; i < nodePlace; i++) {
			key = head.getKey();
		}
		
		 return key;
	}*/
	
	public void setKey(IntNode head, int newKey) {
		// Add condition to ascertain that no nodes with key equal to newKey currently exist in the linked list.
		
		int i = 1;
		/*
		if(counter == 1) {
			if(key != newKey) {
				this.key = newKey;
				i++;
			}
		} else if(counter > 1) {
			while(i  <  counter) {
				if(head.nextNode.getKey() != head.getKey() ) {
					head = head.nextNode;
					i++;
					this.key = newKey;
				} else{ 
			removeDuplicate(newKey);
			i = counter;
			}
			//}
		}*/
		
		this.key = newKey;
	}
		
	public IntNode getNext() {
		 return this.nextNode;
	}
	
	public void setNext(IntNode newNext) {
		this.nextNode = newNext;
	}
	
	public void addNodeInOrder(IntNode head, int newKey) {
		counter++;
		if(counter >= 13) {
		System.out.println("Running addNodeInOrder() on target " + counter + " and data " + getKey() +"\n");
			
		System.out.println("The (sequence number, data) pairs in the linked list are: (" + counter +  ", " + getKey() + ")\n");
		
		//(" + counter +  ", " + getKey() + ") == getPairs()
		
		}
		
		setKey(head, newKey);
		
		this.nextNode = new IntNode(newKey, nextNode);
		
	}
	
	/*public void getPairs(){
	  	int cnt;
	  
	  	for(cnt = 13; cnt <= counter; cnt++){
	   	System.out.println("(" + cnt + "," + getKey() + ")");
	   }
	 
	  }*/
	 
	
	public boolean deleteNodeAfter() {
		boolean status = true;
		
		if (this.nextNode != null) {
		   this.nextNode = this.nextNode.nextNode;
		} else status = false;
		   
		return status;
	}
	
	public int getLength(IntNode head) {
	   int cnt = 0;
	   
	   IntNode current;
	   
	   for (current = head; current != null; current = current.nextNode) {
		   cnt++;
	   }
	   
	   return cnt;
	}
}

	

