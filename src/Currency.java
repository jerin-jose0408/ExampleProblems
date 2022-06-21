import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value to get ");
		Scanner scan=new Scanner(System.in);
		int val=scan.nextInt();
		scan.close();
		int[] curr= {2000,500,200,100,50,20,10,5,2,1};
		int[] count= new int[curr.length];

		for(int i=0;i<curr.length;i++) //i=1
		{
			if(val>=curr[i])
			{
				count[i]=val/curr[i]; //500=1,200=2,20=2,5=1
				val-=curr[i]*count[i];//val=445,45,5
			}
			if(val==0)
				break;
		}
		System.out.println("The below currency notes can be used: ");
		for(int i=0;i<curr.length;i++)
		{
			if(count[i]!=0)
			System.out.println(curr[i]+":"+count[i]);
		}
	
	}

}
