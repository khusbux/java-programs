import java.util.*;
class max
{  
  public static void main(String args[])
  { 
    Scanner o = new Scanner(System.in);
	int x,y;
	System.out.println("enter the value of x and y :");
	x=o.nextInt();
	y=o.nextInt();
	if(x>y)
	{ 
	  System.out.println("max number is x :"+x);
	}
	else
	{ 
	  System.out.println("max number is y :"+y);
	}
  }
}