public class RevrseArray {

	/*
	 * The function reverseArray modify the input list by reversing its elements.
	 * The function/method reverseArray accepts two arguments-len,an integer
	 * representing the length of list and arr,list of integers representing the
	 * input list respectively.
	 * 
	 * For example,if the input list arr is{20 30 10 40 50}
	 * the function/method is  supposed to print {50 40 10 30 20}
	 */
	public static void main(String args[]) {
		
		int a[] = {20,30,10,40,50};
		int l = a.length;
		//System.out.println(l);
		RevrseArray r = new RevrseArray();
		r.reverseArray(l,a);
		
		
	}
	public void reverseArray(int len,int[] arr) {
		int i  , temp;
		int originalLen = len-1;
		for (i = 0; i < len/2; i++,originalLen--) { 
			temp = arr[originalLen]; 
			arr[originalLen]= arr[i]; 
			arr[i] = temp;
			
			
		}
		for(int j=0;j<len;j++)
		{
		System.out.println(arr[j]); //50 40 10 30 20
		}
	}
}
