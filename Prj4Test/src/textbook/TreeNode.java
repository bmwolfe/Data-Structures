package textbook;

//Brendon Wolfe and Joseph Bozowski

public class TreeNode {

		private String computerName;

		private int[] malwareAnalyses; // This instance variable belongs to detector work that lies outside the scope of the project.

		private TreeNode parent; 

		private TreeNode leftChild;

		private TreeNode rightChild;
		
		
		// Precondition: None.
		// Postcondition: A new node is created for a computer in the large enterprise network, 
		//                and its instance variables are initialized.
		//
		public TreeNode(String computerNameValue, TreeNode parentValue, TreeNode leftChildValue, TreeNode rightChildValue)
		{
			   this.computerName = computerNameValue;
			   this.parent = parentValue;
			   this.leftChild = leftChildValue;
			   this.rightChild = rightChildValue;
		}
		
		public String getComputerName() {
			return this.computerName;
		}
		
		public TreeNode getLeftChild() {
			   return this.leftChild;
		}
		
		
		public TreeNode getRightChild() {
			   return this.rightChild;
		}
		
		public TreeNode getParent() {
			return this.parent;
		}
		
		
		// Precondition: currentNode is an existent node in the binary search tree.
		// Postcondition: newNode is inserted in the binary search tree.  
		//                The revised tree satisfies the binary search tree property.
		//
		public void insertNewNode(TreeNode currentNode, TreeNode newNode, TreeNode parentOfCurrentNode, int flg) {
		      
		       if (currentNode == null && parentOfCurrentNode != null) {
		    	   newNode.parent = parentOfCurrentNode;
		    	   
		    	   if (flg == 0) {
		    	      parentOfCurrentNode.leftChild = newNode;
		    	   } else parentOfCurrentNode.rightChild = newNode;
		    	   
		    	   return;
		       }
			 
		       String currentName = currentNode.getComputerName();
		       String searchName = newNode.getComputerName();
		       
		       int comparison = currentName.compareToIgnoreCase(searchName);
		        
		       if (comparison < 0) {
		    	   insertNewNode(currentNode.rightChild, newNode, currentNode, 1);
		       } else {
		    	   insertNewNode(currentNode.leftChild, newNode, currentNode, 0);
		       }	
		
				    
		}
		
		
		// Precondition: currentNode is an existent node in the binary search tree.
		// Postcondition: The tree is walked in order to display the keys of its nodes.  
		//                The walk starts at currentNode.
		//
		
		//Grandchild child grandchild, parent, grandchild child grandchild
		
		public TreeNode analyzeInOrder(TreeNode currentNode)   
		{
			
			TreeNode temp = null;
			   
				  
				  if(currentNode.rightChild != null && currentNode.leftChild != null) {
					  temp = currentNode.leftChild;
					  analyzeInOrder(temp);
					  System.out.println("Analyzing: " + currentNode.getComputerName() + "\n");
					  temp = currentNode.rightChild;
					  analyzeInOrder(temp);
					  
				   } else {

					  System.out.println("Analyzing: " + currentNode.getComputerName() + "\n");
				   }
			   
			   return null;
		}

		
		// Precondition: currentNode is an existent node in the binary search tree.
		// Postcondition: The tree is walked in pre-order to display the keys of its nodes.  
		//                The walk starts at currentNode.
		//      
		
		//How it is input into the program
		
		public TreeNode analyzeInPreOrder(TreeNode currentNode)   
		{
			
			
			//Add print statements and double check the logic to be sure it works
			//Does the print statement go at the end? and before the loop?
			
			
		   TreeNode temp = null;
		   
		   System.out.println("Analyzing: " + currentNode.getComputerName() + "\n");
		   
			  
			  if(currentNode.rightChild != null && currentNode.leftChild != null) {
				  temp = currentNode.leftChild;
				  analyzeInPreOrder(temp);
				  temp = currentNode.rightChild;
				  analyzeInPreOrder(temp);
			   } if(currentNode.leftChild != null && currentNode.rightChild == null) {
				   temp = currentNode.leftChild;
				   analyzeInPreOrder(temp);
			   }
			  else if(currentNode.leftChild == null && currentNode.rightChild != null){
				  temp = currentNode.rightChild;
				  analyzeInPreOrder(temp);
			   }
		
		   
		   return null;
		}
		
		
		// Precondition: currentNode is an existent node in the binary search tree.
		// Postcondition: The tree is walked in post-order to display the keys of its nodes.  
		//                The walk starts at currentNode.
		//      
		
		public TreeNode analyzeInPostOrder(TreeNode currentNode)   
		{
			 
			 TreeNode temp = null;
			   
			 if(currentNode.rightChild != null && currentNode.leftChild != null) {
				  temp = currentNode.leftChild;
				  analyzeInPostOrder(temp);
				  temp = currentNode.rightChild;
				  analyzeInPostOrder(temp);
			   }  if(currentNode.leftChild != null && currentNode.rightChild == null) {
				   temp = currentNode.leftChild;
				   analyzeInPostOrder(temp);
			   }
			  else if(currentNode.leftChild == null && currentNode.rightChild != null){
				  temp = currentNode.rightChild;
				  analyzeInPostOrder(temp);
			   }
			     

			 System.out.println("Analyzing: " + currentNode.getComputerName() + "\n");
		   
		   return null;
		}
		
	}


