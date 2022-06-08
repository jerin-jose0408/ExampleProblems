import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check prime:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int val=scan.nextInt(),mid=val/2,flag=0;
		if(val==0||val==1)
		{
			System.out.println(val+" is not a prime number");
		}
		else
		{
			for(int i=2;i<=mid;i++)
			{
				if(val%i==0)
				{
					System.out.println(val+" is not a prime number");
					flag=1;
					break;
				}
				
			}
			if(flag==0)
			{
				System.out.println(val+" is a prime number");
			}
		}
	}

}
