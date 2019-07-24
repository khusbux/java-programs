import java.util.*;
class Evodd
{
  public static void main(String[] a)
  {
    int n;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter any number :");
	n = obj.nextInt();
	if(n%2==0)
	System.out.println("even number :");
	else
	System.out.println("odd number :");
  }
}