package textbook;

//Brendon Wolfe and Joseph Bozowski

public class StackWork
{
   private int[] S0;
   private int S0top;   
   private int S0length;
   
   private int[] S1;
   private int S1top;   
   private int S1length;
   
   private int[] S2;
   private int S2top;   
   private int S2length;
   
   
   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
   public StackWork(int S0size, int S1size, int S2size)
   {
	   S0 = new int[S0size];
	   S1 = new int[S1size];
	   S2 = new int[S2size];
	   S0top = -1;
	   S1top = -1;
	   S2top = -1;
	   this.S0length = S0size;
	   this.S1length = S1size;
	   this.S2length = S2size;
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1, 
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted 
   // in stack S2.
   public void Push(int x, int StackSelector)
   {	 
	   if(StackSelector == 0) {
		   if(StackFullS0() == false) {
				S0[++S0top] = x;
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   } else if(StackSelector == 1) {
		   if(StackFullS1() == false) {
				S1[++S1top] = x;
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   } else {
		   if(StackFullS2() == false) {
				S2[++S2top] = x;
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   }
   }
   
   public boolean StackFullS0() {
		if (S0top == S0length - 1)
			return true;
		else return false;
	}
   
   public boolean StackFullS1() {
		if (S1top == S1length - 1)
			return true;
		else return false;
	}
   
   public boolean StackFullS2() {
		if (S2top == S2length - 1)
			return true;
		else return false;
	}
   

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller. 
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
 
   public int Pop(int StackSelector)
   {
	   if(StackSelector == 0) {
		   if(!StackEmptyS0()) {
				return S0[S0top--];
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   } else if(StackSelector == 1) {
		   if(!StackEmptyS1()) {
				return S1[S1top--];
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   } else {
		   if(!StackEmptyS2()) {
				return S2[S2top--];
			} else {
				throw new java.lang.ArrayIndexOutOfBoundsException();
			}
	   }
   }
   
   public boolean StackEmptyS0() {
		if (this.S0top == -1) 
			return true;
		 else return false;
	}
   
   public boolean StackEmptyS1() {
		if (this.S1top == -1) 
			return true;
		 else return false;
	}
   
   public boolean StackEmptyS2() {
		if (this.S2top == -1) 
			return true;
		 else return false;
	}
   
   
   // Precondition: 
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
   public void displayStackData()
   {
	   System.out.println("Data in S0: ");
	   for(int i = 0; i <= S0top; i++) {
		   System.out.print(S0[i] + " ");
		   	if(i == S0top) {
		   		System.out.println();
		   	}
	   } 
	   System.out.println("Data in S1: ");
	   for(int j = 0; j <= S1top; j++) {
		   System.out.print(S1[j] + " ");
		   	if(j == S1top) {
		   		System.out.println();
		   	}
	   } 
	   System.out.println("Data in S2: ");
	   for(int k = 0; k <= S2top; k++) {
		   System.out.print(S2[k] + " ");
		   	if(k == S2top) {
		   		System.out.println();
		   	}
	   }
	   
   }

      
   // Precondition: The StackWork object exists.
   // Postcondition: The instance variable S0top is returned.
   public int getS0top()   
   {
	   return S0top;
   }
   
}	
