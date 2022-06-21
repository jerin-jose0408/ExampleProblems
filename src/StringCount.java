import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to count: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		System.out.println("The count of the string "+str+" is "+str.length());
	}

}
