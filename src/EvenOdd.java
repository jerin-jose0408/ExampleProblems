import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter the elements one by one");
		int[] val=new int[n];
		for(int i=0;i<n;i++)
		{
			val[i]=scan.nextInt();
		}
		scan.close();
		
		for(int i=0;i<n;i++)
		{
			if(val[i]%2==0)
			{
				System.out.println(val[i]+" is even number");
			}
			else
			{
				System.out.println(val[i]+" is odd number");
			}
		}
	}

}
