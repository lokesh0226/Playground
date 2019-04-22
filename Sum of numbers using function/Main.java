import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=sum(n);
      System.out.println(p);
	}
  public static int sum(int m)
  {
    int sum=0;
  for(int i=1;i<=m;i++)
  {
  sum=sum+i;
  }
  return sum;
  
  }
  
}