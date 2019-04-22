import java.util.Scanner;
class Main
{

	public static void main (String[] args)
    {
	 // Type your code here   
	Scanner in=new Scanner(System.in);
  int n=in.nextInt();
     
     
      int p= square(n);
      System.out.println(p);
    }
  public static int square(int m)
  {
  int sqre=m*m;
  return sqre;
  }
  
}