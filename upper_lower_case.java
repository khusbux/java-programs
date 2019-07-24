class ulcase
{ 
  public static void main(String args[])throws Exception
  {
	  System.out.println("Enter any character to check :");
	  char ch;
	  ch = (char)System.in.read();
	  if(ch>='A'&& ch<='Z')
	  {
		  System.out.println("char is in uppercase");
	  }
	  else if(ch>='a'&& ch<='z')
	  {
		  System.out.println("char is in lowerercase");
	  }
	  else
	  {
		  System.out.println("type of symbol");
	  }
  }
}