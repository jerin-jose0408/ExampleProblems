import java.util.Scanner;

class QuickSort
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, n-1);

		System.out.println("sorted array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	void sort(int arr[], int low, int high)
	{
		if (low < high)
		{
			int p = partition(arr, low, high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}
	
	int partition(int arr[], int low, int high)
	{
		int pivot = arr[high];
		int i = (low-1); 
		for (int j=low; j<high; j++)
		{
			if (arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

}