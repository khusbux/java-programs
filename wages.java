import java.util.*;
class wages
{
  public static void main(String[] args)
  { 
    Scanner o= new Scanner(System.in);
	int hrs,r;
    System.out.println("enter hrs:");
	hrs = o.nextInt();
	r=(hrs<=8)?50:50+(hrs-8)*25;
	System.out.println("your wages:"+r);
  }
}