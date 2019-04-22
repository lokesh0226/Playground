import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
	System.out.println(gcdNumber(n1,n2,n3));
    
    
    }
  public static int gcdNumber(int n1,int n2,int n3)
  {
  int min,gcd=0;
    int m,g=0;
    if(n1<n2)
    {
    min=n1;
    }
  else
    min=n2;
    
    while(min>=1)
    {
    if((n1%min==0)&&(n2%min==0))
    {gcd=min;
    break;}
    min=min-1;
    }
    
    if(gcd<n3)
      m=gcd;
    else
      m=n3;
    
  while(m>=1)
  {
  if((gcd%m==0)&&(n3%m==0))
  {g=m;
  break;}
  m=m-1;
  
  
  }
    return g;
  }
}