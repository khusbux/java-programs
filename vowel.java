class vowel
{ 
 public static void main(String args[]) throws Exception
 {
  char chr;
  System.out.println("enter any character to check :");
  chr=(char)System.in.read();
  if(chr == 'a'|| chr == 'e'||chr == 'i'||chr == 'o'||chr =='u')
    System.out.println("given char is a vowel");
	else
	System.out.println("given char is a consonant");
 }
}