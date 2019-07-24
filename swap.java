import java.util.Scanner;
  class Swapp
  {
    public static void main(String[] args)
	{ 
	  Scanner ob = new Scanner(System.in);
	  int x,y;
	  System.out.println("enter the value of x and y :");
	  x=ob.nextInt();
	  y=ob.nextInt();
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  System.out.println("after swap value of x :"+x);
	  System.out.println("after swap value of x :"+y);
		
	}
  }
