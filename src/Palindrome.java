import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to find Palindrome: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		StringBuilder str1=new StringBuilder(str);
		str1.reverse();
		if(str.equalsIgnoreCase(str1.toString()))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}

}
