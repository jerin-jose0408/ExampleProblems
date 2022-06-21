
import java.util.Scanner;

public class RetrieveLowerCaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				str1+=str.charAt(i);
			}
		}
		System.out.println("Lower case letters "+str1);

	}

}
