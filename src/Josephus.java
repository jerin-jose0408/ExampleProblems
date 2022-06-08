import java.util.Scanner;
/*The program is based on circular left shift
 * if the input is 5 (101) the output will be 3(011)
 * 
 */
public class Josephus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of soldiers");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int val=scan.nextInt();
		System.out.println("The position that Joseph needs to be present to escape is "+joseph(val));
	}
	
	static int joseph(int n)
	{
		int pos=msbPos(n);// function to find the number of positional bits 101
		int j=1<<(pos-1);//left shifting the positional values and storing the value in variable j using bitwise operator 100
		n=n^j;//just to change the left most value from 1 to 0 using j using xor operator101^100 001
		n=n<<1;//again left shifting the values to just add an extra 0 using bitwise operator 010
		n=n|1;//finally adding 1 at LSB using bitwise 010|001 =011
		return n;
	}
	static int msbPos(int n)
	{
		int pos=0;
		while(n!=0)
		{
			pos++;
			n=n>>1; 
		}
		return pos;
		
	}

}
