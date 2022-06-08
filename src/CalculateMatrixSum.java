public class CalculateMatrixSum {

	/*
	 * The function/method calculateMatrixSum returns an integre representing the
	 * sum of odd elements of the given matrix whose ith and jth index are the same [ 3 3 3 
	 * 																				3 3 3	
	 * The function/method calculateMatrixSum accepts three arguments -rows,an integer3 3 3]
	 * representing the number of rows of the given matrix,columns,
	 * an integer representing the number of columns of the given matrix 
	 * and matrix representing a two dimensional array of integers.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{2,3},{3,2}};
		CalculateMatrixSum cms=new CalculateMatrixSum();
		
		System.out.println(cms.calculateMatrixSum(2,2,matrix));
	}
	int calculateMatrixSum(int rows,int columns,int matrix[][])
	{
		int i,j,sum=0;
		if((rows>0) &&(columns>0)) {
			for (i = 0; i < rows; i++) {
				//sum=0;
				for ( j = 0; j < columns; j++) {
					if(i==j) {
						if(matrix[i][j]%2!=0)
							sum +=matrix[i][j];
					}
					
				}
				
			}
			return sum;
		}
		else
			return sum;
	}
}
