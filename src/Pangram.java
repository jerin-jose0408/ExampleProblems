import java.util.HashSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Character> char1=new HashSet<Character>();
		HashSet<Character> char2=new HashSet<Character>();
		System.out.println("Enter the string to find Pangram");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			char2.add(Character.toLowerCase(str.charAt(i)));
		}
		for(char c='a';c<='z';c++)
		{
			char1.add(c);
		}
		char1.retainAll(char2);
		boolean val=char1.size()==char2.size()?true:false;
		System.out.println(val);
	}

}
