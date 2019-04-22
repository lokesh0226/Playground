import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(greatest_of_three(n1,n2,n3));
	}
  public static int greatest_of_three(int n1,int n2,int n3)
  {
    int max,p;
  if(n1>n2)
  {
  max=n1;
  }
  else
    max=n2;
  
  if(max>n3)
    p=max;
    else
      p=n3;
    return p;
  }
}