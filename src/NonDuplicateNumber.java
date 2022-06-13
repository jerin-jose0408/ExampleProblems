import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonDuplicateNumber {

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
		
		HashMap<Integer,Integer> val=new HashMap<Integer,Integer>();
		
	
		for(int i=0;i<n;i++)     
		{
			if(val.containsKey(array[i]))
			{
				val.put(array[i],val.get(array[i])+1);
			}  
			else
			{
				val.put(array[i],1);
			}
		}
		System.out.println("The below values only occurs once");
		
		
		for(Map.Entry<Integer, Integer> entry :val.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey()+" ");
			}
				
		}
		
	}

	}


