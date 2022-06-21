import java.util.Arrays;
import java.util.Scanner;

public class TC_51_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array one by one");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);
		System.out.println("The second largest element in the array is "+arr[n-2]);
	}

}
