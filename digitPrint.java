import java.util.*;
class digitPrint
{
  public static void main(String args[])
  {
	int t;
	int a[] = new int [20];
    System.out.println("enter  any number :");
	Scanner obj = new Scanner(System.in);
	int x = obj.nextInt();
	String s=Integer.toString(x);
	for(int i=0; i<s.length(); i++)
	{
		t=x%10;
		x=x/10;
		a[i]=t;
	}
	for(int i=a.length-1; i>=0; i--)
	{
		if(a[i]!=0)
			System.out.println(a[i]);
	}
  }
}