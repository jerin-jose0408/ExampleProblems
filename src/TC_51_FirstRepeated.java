
import java.util.Scanner;

public class TC_51_FirstRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to find the first repeated character: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		for(int i=0;i<str.length();i++)
		{
		if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i)))
		{
			System.out.println("The first repeated character is "+str.charAt(i));
			return;
		}
		}
	}
		
		

}
