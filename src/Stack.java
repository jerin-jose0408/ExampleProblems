import java.util.Scanner;

public class Stack {
	private int arr[];
	  private int top;
	  private int size; // maximum no. of elements allowed in the stack
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Stack s=new Stack(10);
		Scanner scan=new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("Enter 1 to push,2 to pop, 3 to display and Enter anyother integer values to come out of loop");
			int value=scan.nextInt();
			
			switch(value)
			{
			case 1: System.out.println("Enter value to push");
					int x=scan.nextInt();
					s.push(x);
					break;
			case 2: s.pop();
					break;
			case 3: s.display();
					break;
			default: System.out.println("Program ends");
				return;
			}
		}
		
		
	}
	
	  
	  //Constructor
	  Stack (int size){
	    arr = new int[size];
	    this.size = size; 
	    top = -1; 
	  }
	  
	  // get the current size (no. of elements ) of the stack
	  public int currentSize(){
	    return top+1;
	  }

	  // checking if the stack is empty
	  public boolean isEmpty(){
	    return top == -1;
	  }

	  // checking if the stack is full
	  public boolean isFull(){
	    return top == size - 1;
	  }

	  // pushing values into stack
	  public void push (int x) {
	    if ( isFull() ){
	      System.out.println("\nStack is full.");
	      return;
	    }
	    System.out.println("\nInserting "+x);
	    arr[++top] = x;
	    if(top>=0)
		  {
			  for(int i=top-1;i>=0;i--)
			  {
				  if(x==arr[i])
				  {
					  pop();
					  System.out.print(" as it is duplicate\n");
					  break;
				  }
			  }
		  }
	    
	  }
	  
	  // popping out values from stack
	  public int pop (){
	    if ( isEmpty() ){
	      System.out.println("No values to pop");
	      System.exit(1);
	    }
	    System.out.print("Popping "+arr[top]);
	    return arr[top--];
	  }
	  
	  public void display()
	  {
		  if(top>=0)
		  {
			  System.out.println("\nStack elements are");
			  for(int i=top;i>=0;i--)
			  {
				  System.out.println(arr[i]);
			  }
		  }
		  else
		  {
			  System.out.println("Stack is empty");
		  }
	  }


}
