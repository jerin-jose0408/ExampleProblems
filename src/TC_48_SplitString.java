import java.util.Scanner;

public class TC_48_SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string to split");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Enter the delimiter");
		String str1=scan.nextLine();
		scan.close();
		String afterSplit[]=str.split(str1);
		for(String str2:afterSplit)
		{
			System.out.println(str2);
		}
	}

}
