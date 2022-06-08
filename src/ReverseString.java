import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		StringBuffer str1=new StringBuffer();
		str1.append(str);
		System.out.println("The reverse of the string "+str+" is "+str1.reverse());
		
	}

}
