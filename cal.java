import java.util.*;
class cal
{
  public static void main(String args[])
  {
    int a,b;
	System.out.println("enter the valu of a and b :");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	b = sc.nextInt();
	int sq = (a-b)*(a+b);
	System.out.println("the valu is "+sq);
		
  }
}