public class Replacevalue {

	/*
	 * The function/method replaceValues is modifying the input list in such a way-
	 * if the length of input list is odd, then all the elements of the input list
	 * are supposed to be replaced by 1s and in case it is even,the elements should
	 * be replaced by 0s
	 * 
	 * For example:given the input list[0 1 2]
	 * the function will modify the input just like [1 1 1]
	 * 
	 * The funcyion/method replaceValues accepts two arguments -size,an integer
	 * representing the size of the given input list and inputList,
	 * a list of integers representing the input list.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,2,4,7,20};
		int l= a.length;
		Replacevalue r1 = new Replacevalue();
		r1.replaceValues(l, a);

	}
	void replaceValues(int size,int[] inputList) {
		int i , j;
		if(size %2 ==0) {
			i=0;
			while(i<size) {
				inputList[i] = 0;
				i+=1;
			}
		}
		else {
			j=0;
			while(j<size) {
				inputList[j] = 1;
				j+=1;
			}
			
			
		}
		for(int k=0;k<size;k++)
		{
			System.out.print(inputList[k]+" ");
		}
	}

}
