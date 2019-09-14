import java.util.*;
class bit_even_odd
{
  public static void main(String args[])
  {  
    int a;
	System.out.println("enter the value of a :");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	if((a&1)==0)
	{ 
	  System.out.println("the value is even "+a);
	}
	else
	{
	  System.out.println("the value is odd "+a);
	}
  }
}