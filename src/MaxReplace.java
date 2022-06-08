public class MaxReplace {
	
	/*
	 * The function/method maxReplace prints space separated integers representing
	 * the input list after replacing all elements of the input list with the
	 * maximum element of the input list
	 * 
	 *  The function/method maxReplace accepts two arguments-
	 *  size,an integer representing the size of the input list and
	 *  inputList , a list of integers representing the input list respectively
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,2};
		int l= a.length;
		MaxReplace m = new MaxReplace();
		
		m.maxReplace(l, a);
	}
	void maxReplace(int size, int []inputList) {
		if(size>0) {
			int max = inputList[0];
			for (int i = 0; i < size; i++) {
				if(max<inputList[i]) {
					max = inputList[i];
				}
			}
		
		
		  for (int i = 0; i <size; i++) { 
			  inputList[i]= max;
		  System.out.print(inputList[i]+ " ");
		  
		  }
		 
	}
}

}