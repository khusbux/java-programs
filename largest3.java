import java.util.*;
class largest3
{
  public static void main(String args[])
  {
    int a,b,c;
	System.out.println("enter the value of a ,b and c :");
	Scanner obj = new Scanner(System.in);
	a = obj.nextInt();
	b = obj.nextInt();
	c = obj.nextInt();
	if(a>b & a>c)
	 {
	   System.out.println("largest value is a "+a);
	 }
	 else if(b>a & b>c)
	 {
	  System.out.println("largest value is b "+b);
	 }
	 else
	 {
	   System.out.println("largest value is c "+c);
	 }
  }
}]