import java.util.Arrays;
import java.util.Scanner;

public class TC_49_Largest_Second_Last {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		
		Arrays.sort(array);
			
		System.out.println("The largest element in the array is "+array[n-1]);
		System.out.println("The second largest element in the array is "+array[n-2]);
		System.out.println("The least element in the array "+array[0]);
	}
}
