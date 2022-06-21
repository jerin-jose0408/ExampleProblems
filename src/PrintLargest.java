import java.util.Scanner;

public class PrintLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value to find the largest");
		Scanner scan=new Scanner(System.in);
		float val=scan.nextFloat();
		String str[]=(Float.toString(val)).split("\\.");
		
		if(Integer.parseInt(str[0])>Integer.parseInt(str[1]))
		{
			System.out.println(str[0]+" is the largest number");
		}
		else
		{
			System.out.println(str[1]+" is the largest number");
		}
		scan.close();
	}

}
