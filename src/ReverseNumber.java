import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to reverse: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.print("The reverse of "+num);
		int mult=0;  
        while (num != 0)
        {
        	mult=mult*10+num%10;
        	num=num/10;
        }
            
        System.out.print("is "+mult);
        scan.close();
	}

}
