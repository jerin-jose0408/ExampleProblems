import java.util.ArrayList;
import java.util.Scanner;

public class TC_53_FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string to find the first repeated character: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		ArrayList<Character>arr=new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(arr.contains(str.charAt(i)))
			{
				System.out.println(str.charAt(i)+" is the first repeated character");
				return;
			}
			else
			{
				arr.add(str.charAt(i));
			}
		}
		System.out.println("There are no repeated characters");
	}

}
