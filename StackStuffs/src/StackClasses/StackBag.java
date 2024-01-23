package StackClasses;

public class StackBag {
	
	private int top;
	private int size;
	private int[] StackArray;
	
	public StackBag(int size) {
		StackArray = new int[size];
		this.size = size;
		top = -1;
	}
	
	public boolean StackEmpty() {
		if (this.top == -1) 
			return true;
		 else return false;
	}
	
	public boolean StackFull() {
		if (top == size - 1)
			return true;
		else return false;
	}
	
	public void push(int newData) {
		if(StackFull() == false) {
			StackArray[++top] = newData; // is logically equivalent to top++; StackArray[top++] = newData;
		} else {
			throw new java.lang.ArrayIndexOutOfBoundsException();
		}
	}
	
	public int pop() {
		if(!StackEmpty()) {
			return StackArray[top--];
		} else {
			throw new java.lang.ArrayIndexOutOfBoundsException();
		}
	}
	
	public void printStack() {
		if(!StackEmpty()) {
			System.out.println("Now printing the contents of the stack from the bottom of the stack: ");
			for(int i = 0; i <= top; i++) {
				System.out.println(StackArray[i] + " ");
			}
			System.out.println("This is the end of the stack");
		} else {
			System.out.println("There is no data in stack");
			return;
		}
		
	}
	
	public int inspectTop() {
		
		if (!StackEmpty()) {
			System.out.println("The top of the stack is: " + StackArray[top]);
		return StackArray[top];
		} else throw new java.lang.ArrayIndexOutOfBoundsException();
		
		
		
	}
	
}
