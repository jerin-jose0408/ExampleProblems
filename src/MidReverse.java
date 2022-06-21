import java.util.Scanner;

public class MidReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] val=new int[n];
		int[] val1=new int[n];
		
		System.out.println("Enter the elements one by one");
		for(int i=0;i<n;i++)
		{
			val[i]=scan.nextInt();
		}
		scan.close();
		for(int i=(n/2)-1,j=0;i>=0;i--,j++) 
		{
			val1[j]=val[i];
		}
		for(int i=n-1,j=n/2;i>=n/2;i--,j++)
		{
			val1[j]=val[i];
		}
		for(int i=0;i<n;i++)
		System.out.print(val1[i]+" ");
	}

}
