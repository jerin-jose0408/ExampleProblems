import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first number:");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		System.out.println("Enter the second number:");
		@SuppressWarnings("resource")
		Scanner scan1=new Scanner(System.in);
		int num2=scan1.nextInt();
		
		System.out.println("Numbers before swapping Number1="+num1+" and Number2="+num2);
		num1=num1+num2; 
		num2=num1-num2; 
		num1=num1-num2; 
	
		System.out.println("Numbers after swapping Number1="+num1+" and Number2="+num2);

	}

}
