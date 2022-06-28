
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		spacestar();
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar(0,8);
		System.out.println();
		spacestar(4);
		System.out.print("\t");
		spacestar(0);
		System.out.print("\t");
		spacestar(0,8);
		System.out.print("\t");
		spacestar(4);
		System.out.print("\t");
		spacestar(0,1,8);
		System.out.println();
		spacestar(4);
		System.out.print("\t");
		spacestar(0);
		System.out.print("\t");
		spacestar(0,7);
		System.out.print("\t");
		spacestar(4);
		System.out.print("\t");
		spacestar(0,2,8);
		System.out.println();
		spacestar(4);
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar(0,3,6);
		System.out.print("\t");
		spacestar(4);
		System.out.print("\t");
		spacestar(0,3,8);
		System.out.println();
		spacestar(4);
		System.out.print("\t");
		spacestar(0);
		System.out.print("\t");
		spacestar(0,4);
		System.out.print("\t");
		spacestar(4);
		System.out.print("\t");
		spacestar(0,4,8);
		System.out.println();
		spacestar(4);
		System.out.print("\t");
		spacestar(0);
		System.out.print("\t");
		spacestar(0,6);
		System.out.print("\t");
		spacestar(4);
		System.out.print("\t");
		spacestar(0,5,8);
		System.out.println();
		for(int i=0;i<9;i++)
		{
			if(i<=4)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar(0,8);
		System.out.print("\t");
		spacestar();
		System.out.print("\t");
		spacestar(0,7,8);
		
		
	}
	public static void spacestar()
	{
		for(int i=0;i<9;i++)
		{
			System.out.print("*");
		}
	}
	public static void spacestar(int val)
	{
		for(int i=0;i<9;i++)
		{
			if(i==val)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
	}
	public static void spacestar(int val,int val1)
	{
		for(int i=0;i<9;i++)
		{
			if(i==val||i==val1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
	public static void spacestar(int val,int val1,int val2)
	{
		for(int i=0;i<9;i++)
		{
			if(i==val||i==val1||i==val2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
	}

}
