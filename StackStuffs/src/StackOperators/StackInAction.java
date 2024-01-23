package StackOperators;

import StackClasses.StackBag;

public class StackInAction {

	public static void main(String[] args) {
		System.out.println("This is main working with a stack\n");

		StackBag ages = new StackBag(100);
		
		ages.push(4);
		ages.push(5);
		ages.push(6);
		ages.push(20);
		ages.push(7);
		ages.push(8);
		ages.push(25);
		
		
		ages.printStack();
		
		ages.inspectTop();
		
		ages.pop();
			
		ages.inspectTop();
		
	}

}
