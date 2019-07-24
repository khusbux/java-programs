import java.util.*;
class avipglu
{
  public static void main(String args[])
{ 
  Scanner o = new Scanner(System.in);
  int a=4,b=5,r;
  System.out.println("enter the value of a and b");
  a=o.nextInt();
  b=o.nextInt();
  r=(a>b)?(a+b):(a*b);
  System.out.println("value of r is= "+r);
  
}  
}
