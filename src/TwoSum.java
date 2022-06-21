import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the target value");
		int target=scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(target==(arr[i]+arr[j]))
				{
					System.out.println("The index values are "+i+" and "+j);
					return;
				}

			}
			
		}
	}

}
