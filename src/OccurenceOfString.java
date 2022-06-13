import java.util.Scanner;

public class OccurenceOfString {
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Enter the string for which the occurence has to be found: ");
		@SuppressWarnings("resource")
		Scanner scan1=new Scanner(System.in);
		String str1=scan1.nextLine();
		int count=0;
		
		for(int i=0;i<=str.length()-str1.length();i++)
		{
			if(str.substring(i,i+str1.length()).equalsIgnoreCase(str1))
			{
				count++;
			}
		}
		
		System.out.println("The string "+str1+" occurs "+count+" times");
	
	
	}
}
