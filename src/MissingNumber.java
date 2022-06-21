
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val= {1,2,3,5,6};
		int n=val.length+1;
		n=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<val.length;i++)
		{
			sum+=val[i];
		}
		System.out.println("The missing number is "+(n-sum));
		
	}

}
