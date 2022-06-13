import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] array=new String[n];
		System.out.println("Enter the cities in the array");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.next();
			
		}
		
		HashMap<String,Integer> val=new HashMap<String,Integer>();
		
	
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
		
		System.out.println("The below cities are duplicates");
		
		
		for(Map.Entry<String, Integer> entry :val.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.print(entry.getKey()+" ");
			}
				
		}
		

	}

}
