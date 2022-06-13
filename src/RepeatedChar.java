import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to find duplicate values: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		HashMap<Character,Integer> val=new HashMap<Character,Integer>();
		
	
		for(int i=0;i<str.length();i++)     
		{
			if(val.containsKey(str.charAt(i)))
			{
				val.put(str.charAt(i),val.get(str.charAt(i))+1);
			}  
			else
			{
				val.put(str.charAt(i), 1);
			}
		}
		System.out.println("The repeated characters are");
		
		
		for(Map.Entry<Character, Integer> entry :val.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
				
		}
	}

}
