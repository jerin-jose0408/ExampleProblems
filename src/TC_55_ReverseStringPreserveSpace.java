import java.util.Scanner;

public class TC_55_ReverseStringPreserveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] str1=str.toCharArray();
		
		
		for(int i=0,j=str.length()-1;i<j;)     
		{
			if(!Character.isAlphabetic(str1[i]))
			{
				i++;
			}
			else if(!Character.isAlphabetic(str1[j]))
					{
					j--;
					}
			else
			{
				char temp=str1[i];
				str1[i]=str1[j];
				str1[j]=temp;
				i++;j--;
			}
				
		}
		String str2=new String(str1);
		
		System.out.println("The reversed string without special character is "+str2);

	}

}
