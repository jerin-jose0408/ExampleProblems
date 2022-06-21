import java.util.Scanner;

public class TC_57_MatrixMult {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the row of the first matrix");
		Scanner scan=new Scanner(System.in);
		int r1=scan.nextInt();
		System.out.println("Enter the column of the first matrix");
		int c1=scan.nextInt();
		System.out.println("Enter the row of the second matrix");
		int r2=scan.nextInt();
		int[][] mat1=new int[r1][c1];
		
		
		if(c1!=r2)
		{
			System.out.println("Matrix multiplication is not possible as the column of "
					+ "first matrix is not matching the row of the second matrix");
			return;
		}
		System.out.println("Enter the column of the second matrix");
		int c2=scan.nextInt();
		int[][] mat2=new int[r2][c2];
		int[][] res=new int[r1][c2];
		
		
		System.out.println("Enter the elements of the first matrix ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mat1[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter the elements of the second matrix ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				mat2[i][j]=scan.nextInt();
			}
		}
		
		scan.close();
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				res[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					res[i][j]+=mat1[i][k]*mat2[k][j]; 
				}
				
			}
		}
		
		System.out.println("The matrix multiplication is ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
