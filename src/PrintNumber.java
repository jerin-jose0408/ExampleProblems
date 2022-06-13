import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to print only numbers: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String str1="";
		
		
		for(int i=0;i<str.length();i++)     
		{
			if(Character.isDigit(str.charAt(i)))
			{
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
