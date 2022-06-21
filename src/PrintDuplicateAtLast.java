import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintDuplicateAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		HashMap<Integer,Integer> val=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(val.containsKey(arr[i]))
			{
				val.put(arr[i], val.get(arr[i])+1);
			}
			else
			{
				val.put(arr[i], 1);
			}
		}
		System.out.println(val);
		int j=0,k=n-1;
		for(Entry<Integer,Integer> entry: val.entrySet())
		{
			if(entry.getValue()==1)
			{
				arr[j]=entry.getKey();j++;
			}
			else
			{
				int l=0;
				while(l<entry.getValue())
				{
				arr[k]=entry.getKey();
				//System.out.println(k);
				k--;
				l++;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
				
	}

}
