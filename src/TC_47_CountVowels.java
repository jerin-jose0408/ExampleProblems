import java.util.ArrayList;
import java.util.Scanner;

public class TC_47_CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to count vowels: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		int count=0;
		ArrayList<Character> vowels=new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		for(int i=0;i<str.length();i++)
		{
			if(vowels.contains(str.charAt(i)))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("There are no vowels in the string");
		}
		else
		{
			System.out.println("The number of vowels in the string is "+count);
		}

	}

}
