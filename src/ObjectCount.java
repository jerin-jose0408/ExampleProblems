
public class ObjectCount {

	static int count=0;
	public ObjectCount()
	{
		count++;
	}
	public ObjectCount(int s)
	{
		count++;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount o1=new ObjectCount();
		ObjectCount o2=new ObjectCount();
		ObjectCount o3=new ObjectCount();
		ObjectCount o4=new ObjectCount(10);
		System.out.println(count);
	}

}
