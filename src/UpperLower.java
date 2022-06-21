import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to count");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		int countUpper=0,countLower=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isUpperCase(str.charAt(i)))
			{
				countUpper++;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				countLower++;
			}
		}
		System.out.println("The upper case count is "+countUpper+" and lower case count is "+countLower);
	}

}
