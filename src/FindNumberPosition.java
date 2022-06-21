import java.util.Scanner;

public class FindNumberPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),flag=0;
		int[] array=new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the number to find");
		int val=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(val==array[i])
			{
				flag=i;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The number "+val+" is not found");
		}
		else
		{
			System.out.println("The number "+val+" is found at poisition no "+flag);
		}
		
	}
}
