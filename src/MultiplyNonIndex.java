import java.util.Scanner;

public class MultiplyNonIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] array=new int[n];
		int[] array1=new int[n];
		System.out.println("Enter the values in the array");
		for(int i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		
		
		for(int i=0;i<n;i++) 
		{
			array1[i]=1;
			for(int j=0;j<n;j++)
			{
				if(j!=i)
				{
					array1[i]*=array[j];
				}
				
			}
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.println(k+"-"+array1[k]);
		}
	}

}
