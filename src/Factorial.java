import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("The factorial of "+n+" is "+fact(n));
		scan.close();
				
	}
	static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		return n*fact(n-1);
	}

}
