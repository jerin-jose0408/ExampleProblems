import java.util.Scanner;

public class ReverseEachWord {

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
		
		
		System.out.println("The reversed string "+str3);
	
	}
	static String reverse(String str)
	{
		char[] str1=str.toCharArray();
		for(int i=0,j=str.length()-1;i<j;)     
		{
			
			
				char temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
				i++;
				j--;
							
		}
		String str2=new String(str1);
		return str2;
	}
	
}
