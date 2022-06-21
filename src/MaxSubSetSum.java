import java.util.Arrays;

// Java code to find sum of
// maximum of all subsets of array


class MaxSubSetSum
{

	// Method returns sum of maximum of all subsets
	static int sumOfMaximumOfSubsets(Integer arr[], int N)
	{
		// sorting array in decreasing order
		Arrays.sort(arr);

		// initializing sum with first element
		int sum = arr[N-1];

		for (int i = N-2; i >=0; i--)
		{
			// calculating evaluation similar to horner's rule
			sum = 2 * sum + arr[i]; 
			

		}

		return sum;
	}

	// Driver code
	public static void main(String[] args)
	{
		Integer arr[] = {1,2}; //{},{1},{2},{1,2}
		int N = arr.length;
		System.out.println(sumOfMaximumOfSubsets(arr, N));
	}
}