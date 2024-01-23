package recursive;

public class FindMax {
	
	private int[] data;
	private int size;
	
	public FindMax(int size) {
		data = new int[size];
		this.size = size;
	}
	
	//start index = 0 and end index = size - 1
	
	public int getMax(int startIndex, int endIndex) {
		int middle, leftMax, rightMax, foundMax = 0;
		
		
		if(startIndex == endIndex) { // <--------------- BASE CASE
			foundMax = data[startIndex];
		} else { //  <---------------------------------- RECURSIVE CASE
			middle = (endIndex - startIndex) / 2; // OR middle = ((endIndex - startIndex) / 2) + startIndex;
			//middle = startIndex + middle;
			
			leftMax = getMax(startIndex, startIndex + middle);
			rightMax = getMax(startIndex + middle + 1, endIndex);
			
			if(leftMax > rightMax) {
				foundMax = leftMax;
			} else if(rightMax > leftMax) {
				foundMax = rightMax;
			}
		}
		return foundMax;
	}

}
