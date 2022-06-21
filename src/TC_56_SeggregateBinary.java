import java.util.ArrayList;
import java.util.Scanner;

public class TC_56_SeggregateBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		
		System.out.println("Enter the elements one by one ");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		scan.close();
		ArrayList<Integer> zero=new ArrayList<Integer>();
		ArrayList<Integer> one=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				zero.add(arr[i]);
			}
			else if(arr[i]==1)
			{
				one.add(arr[i]);			
			}
		}
		System.out.print("The zero and ones after seggregating is "+zero+one);
		
		
		
	}

}
