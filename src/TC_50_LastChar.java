import java.util.Scanner;

public class TC_50_LastChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		System.out.println("The last character of the string "+str+" is "+str.charAt(str.length()-1));
	}
}
