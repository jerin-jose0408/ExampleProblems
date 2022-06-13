import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargest {

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
		
		System.out.println("The third largest element in the array is"+array[n-3]);
	}

}
