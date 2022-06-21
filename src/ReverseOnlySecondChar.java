import java.util.Scanner;

public class ReverseOnlySecondChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		String str3="";
		String[] arr=str.split(" ");
		
		
		for(String val:arr)
		{
		
		str3+=reverse(val)+" ";
			
		}
		
		
		System.out.println("The reversed string with second character is "+str3);
		
		
	}
	
	static String reverse(String str)
	{
		char[] str1=str.toCharArray();
		str1[0]=Character.toUpperCase(str1[0]);
		for(int i=1,j=str.length()-1;i<j;i++,j--)     
		{
				char temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
			
							
		}
		String str2=new String(str1);
		return str2;
	}
	
	

}
