import java.util.Scanner;

public class CountAlphaDigitSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to count: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int alphaCount=0,digitCount=0,specialCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alphaCount++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digitCount++;
			}
			else
			{
				specialCount++;
			}
			
			
		}
		scan.close();
		System.out.println("The count of alphabets is "+alphaCount+"\nThe Count of Digits is "+digitCount+"\nThe count of Special Characters is "+specialCount);
	}

}
