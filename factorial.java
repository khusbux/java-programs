import java.util.*;
class factorial
{
  public static void main(String args[])
  { 
    Scanner obj = new Scanner(System.in);
	int i=1,n,f=1;
	System.out.println("enter any number to find factorial:");
	n=obj.nextInt();
	while(i<=n)
	{  
	  f=f*i;
	  i++;
	}
	System.out.println("factorial:"+f);
  }
}