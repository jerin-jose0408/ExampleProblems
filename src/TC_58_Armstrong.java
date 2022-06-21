import java.util.Scanner;

public class TC_58_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find armstrong number: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();		
		scan.close();
		int sum=0,num=n; 
        for (; num > 0; sum += cube(num % 10), num /= 10)
            ;
        if(n==sum)
        {
        	System.out.println("The number "+n+" is armstrong number");
        }
        else
        {
        	System.out.println("The number "+n+" is not an armstrong number");
        }
        
	}
	static int cube(int val)
	{
		return val*val*val;
	}

}
