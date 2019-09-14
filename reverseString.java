import java.util.*;
class reverseString
{
  public static void main(String args[])
  {
      System.out.println("enter any string to reverse :");
	  Scanner sc = new Scanner(System.in);
	  char[] letters = sc.next().toCharArray();
	  System.out.println("reverse string :");
	  for(int i = letters.length-1;i>=0;i--)
	  {
	    System.out.print(letters[i]);
	  }
  }
}