import java.util.Scanner;

public class SumWithin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		for(int val:array)
		{
			System.out.print(getSumWithin(val)+",");
		}
		
	}
	
	static int getSumWithin(int n)
    {
        int sum;  
        for (sum = 0; n > 0; sum += n % 10, n /= 10)
            ;
        return sum;
    }

}
