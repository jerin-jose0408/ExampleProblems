import java.util.Scanner;

public class TC_54_StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows you want the pattern: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("* "); 
			System.out.println();
		}
		
	}

}
