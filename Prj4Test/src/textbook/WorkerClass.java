package textbook;

//Brendon Wolfe and Joseph Bozowski

class WorkerClass {

	public static void main(String[] args) {
		
		System.out.println("This is the intrusion detection system running....\n");
		
		TreeNode root = new TreeNode("departments.oakland.edu", null, null, null);
		
		TreeNode biologyComputer = new TreeNode("biology.oakland.edu", null, null, null);
		
		root.insertNewNode(root, biologyComputer, null, 0);
		
		TreeNode accountingComputer = new TreeNode("accounting.oakland.edu", null, null, null);
		
		root.insertNewNode(root, accountingComputer, null, 0);
		
		TreeNode computerScienceComputer = new TreeNode("computerscience.oakland.edu", null, null, null);
		
		root.insertNewNode(root, computerScienceComputer, null, 0);
		
		TreeNode financeComputer = new TreeNode("finance.oakland.edu", null, null, null);
		
		root.insertNewNode(root, financeComputer, null, 0);
		
		TreeNode educationComputer = new TreeNode("education.oakland.edu", null, null, null);
		
		root.insertNewNode(root, educationComputer, null, 0);

		TreeNode industrialEngineeringComputer = new TreeNode("industrialengineering.oakland.edu", null, null, null);
		
		root.insertNewNode(root, industrialEngineeringComputer, null, 0);
		
		
		System.out.println("--------------------------------------------\n");
		System.out.println("Walking the binary search tree in order.\n");
		root.analyzeInOrder(root);
		System.out.println("--------------------------------------------");
		
		   
		 System.out.println("--------------------------------------------\n");
		 System.out.println("Walking the binary search tree in pre-order.\n");
		 root.analyzeInPreOrder(root);
		 System.out.println("--------------------------------------------");
		 
		 System.out.println("--------------------------------------------");
		 System.out.println("Walking the binary search tree in post-order.\n");
		 root.analyzeInPostOrder(root);
		 System.out.println("--------------------------------------------");
	}


}
