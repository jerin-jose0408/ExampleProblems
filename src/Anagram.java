import java.util.HashSet;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two strings to find Anagram");
		
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		scan.close();
		HashSet<Character> set1=new HashSet<Character>();
		HashSet<Character> set2=new HashSet<Character>();
		
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
		if(str1.length()!=str2.length())
		{
		System.out.println(false);
		return;
		}
		
		
		for(int i=0;i<str1.length();i++)
		{
			set1.add(Character.toLowerCase(str1.charAt(i)));
		}
		for(int i=0;i<str2.length();i++)
		{	
			set2.add(Character.toLowerCase(str2.charAt(i)));
		}
		
		
		set1.retainAll(set2);
		boolean val=set1.size()==set2.size()?true:false;
		
		System.out.println(val);
		
	}

}
