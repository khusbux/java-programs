import java.util.*;
class changeHexa
{
 public static void main(String args[])
 { 
    int d_num,rem;
	String h_num = "";
	char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	Scanner sc = new Scanner(System.in);
   System.out.println("enter a decimal number :");
   d_num = sc.nextInt();
   while(d_num>0)
   {
     rem = d_num%16;
	 h_num = hex[rem]+h_num;
	 d_num = d_num/16;
	 System.out.println("hexadecimal number is "+h_num+"\n");
   }
 }
}