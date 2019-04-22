import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
     prime(n);
      
	}
  public static void prime(int a)
  {
  for(int i=2;i<=a;i++)
  {
    int temp=0;
  for(int j=2;j<i;j++)
  {
  if(i%j==0)
  {
  temp=temp+1;
  }
    
  }
  if(temp==0)
  {
  System.out.println(i);
  }
  }
    
  
  
  
  }
  
  
  
}