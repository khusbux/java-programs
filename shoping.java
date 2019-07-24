import java.util.*;
class shoping
{
  public static void main(String args[])
  { 
    Scanner o = new Scanner(System.in);
    float p,total_amnt;
    System.out.println("enter the price of an items:");
	p=o.nextFloat();
	if(p>=5000)
	{ 
	  total_amnt=p-(p*10/100);
	  System.out.println("total_amnt="+total_amnt);
	}
	else
	{	
	System.out.println("total_amnt="+p);
	}
  }
}