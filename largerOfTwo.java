import java.util.*;
class largerOfTwo
{
  public static void main(String args[])
  {
    int x ,y ;
	System.out.println("enter the value of x and y :");
	Scanner sc = new Scanner(System.in);
	x = sc.nextInt();
	y = sc.nextInt();
	if(x>y)
	{
	  System.out.println("x is greater than y\n "+x);
	}
	else
	{
	  System.out.println("y is greater than x\n "+y);
	}
  }
}