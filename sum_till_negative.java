import java.util.*;
class sum
{ 
  public static void main(String args[])
  {
   Scanner obj = new Scanner(System.in);
   int n,sum=0;
   while(true)
   {
	   System.out.println("Enter number :");
	   n=obj.nextInt();
	   if(n<0)
	   break;
       sum=sum+n;
   }
   System.out.println("sum of number "+sum);
   
  }
}
