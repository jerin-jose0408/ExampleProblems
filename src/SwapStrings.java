import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first string to swap: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		
		System.out.println("Enter second string to swap: ");
		@SuppressWarnings({ "unused", "resource" })
		Scanner scan1=new Scanner(System.in);
		String str2=scan.nextLine();
		
		
		System.out.println("Strings before swapping String1="+str1+" and String 2="+str2);
		str1=str1+str2; 
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("Strings after swapping String1="+str1+" and String 2="+str2);

	}

}
