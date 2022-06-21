import java.util.ArrayList;
import java.util.Scanner;

public class ExtractIntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to extract integer: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		ArrayList<Integer> val=new ArrayList<Integer>();
		for(int i=0;i<str.length();i++)
		{
			String str1="";
			while(i<str.length()&&Character.isDigit(str.charAt(i)))
					{
					str1+=str.charAt(i);
					i++;
					}
		
			if(str1.length()>=1)
			{
				val.add(Integer.parseInt(str1));
				i--;
			}
			
		}
		System.out.println(val.stream().mapToInt(Integer::intValue).sum());

	}

}
