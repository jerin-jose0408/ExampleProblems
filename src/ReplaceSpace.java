import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string: ");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Thestring before removing space "+str);
		System.out.println("The string after removing space "+str.replaceAll(" ", ""));
	}

}
