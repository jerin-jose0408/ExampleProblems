

/*Code Approach:For this question,you will need to correct the given implementation
.We do not expect you to modify the approach or incorporate any additional library methods

The function/method sortArray modify the input list by sorting its elements in
descending order.
The function/method sortArray accepts two arguments-len,representing the length of the list and 
arr , a list of integers representing the input list respectively.

*/
public class SortArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,30,10,40,50};
		int l = a.length;
		//System.out.println(l);
		SortArry r = new SortArry();
		r.sortArry(l,a);

	}
	public void sortArry(int len,int[] arr) 
		{
		int i,max,location,j,temp;
		for ( i = 0; i < len; i++) {
			max = arr[i];
			location=i;
			for (j=i; j < len; j++) {
				if(max>arr[j]) {
					max=arr[j];
					location = j;
				}
				
			}
			temp = arr[i];
			arr[i]= arr[location];
			arr[location] = temp;			
		}
		for(int k=len-1;k>=0;k--)
		{
		System.out.println(arr[k]);
		}
	}
		
	

}
