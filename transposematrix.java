import java.util.*;
class transposematrix
{
  public static void main(String args[])
  { 
     Scanner obj = new Scanner(System.in);
    int[][] mat1 = new int[3][3];
	System.out.print("enter elements of mat1 :\n");
	for(int i=0;i<3;i++)
	{ 
	   for(int j=0;j<=3;j++)
	   {
	     mat1[i][j] = obj.nextInt();
	   }
	} System.out.print("\n After Transpose: \n");
	for(int i=0;i<3;i++)
	{
	  for(int j=0;j<3;j++)
	  {
	    System.out.print(mat1[i][j]+"\t");
	  }
	  System.out.println("\n");
	}
  }
}