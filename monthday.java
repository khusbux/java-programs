import java.util.Scanner;
class monthday
{
	public static void main(String args[])
	{
		Scanner o = new Scanner(System.in);
		int days,months;
		System.out.println("enter days:");
		days=o.nextInt();
		months=days/30;
		days=days%30;
	System.out.println("months="+months+"\ndays="+days);	
	}
}
