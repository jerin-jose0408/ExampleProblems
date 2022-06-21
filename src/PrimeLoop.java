
public class PrimeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++)
			prime(i);
		
	}

	static void prime(int val)
	{
	int flag=0;
	if(val==0||val==1)
	{
		//System.out.println(val+" is not a prime number");
		flag=1;
	}
	else
	{
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				//System.out.println(val+" is not a prime number");
				flag=1;
				break;
			}
			
		}
		
	}
	if(flag==0)
	{
		System.out.print(val+" ");
	}
}
}
