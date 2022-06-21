import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence to reverse");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		scan.close();
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
