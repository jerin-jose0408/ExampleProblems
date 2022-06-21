import java.util.Scanner;

public class SwapSpecialChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String str1="";
		System.out.println("The string before swapping "+str);
		
		for(int i=0;i<str.length();++i)
		{
			if(Character.isAlphabetic(str.charAt(i))||Character.isDigit(str.charAt(i)))
			{
				str1+=str.charAt(i);
			}
			else
			{
				
				str=str.substring(++i)+str.charAt(--i)+str1;
				break;
			}
		}
		System.out.println("The string after swapping "+str);
		
		
	}
}
