import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;)
    {if(i<=n)
    System.out.print(i);
     i=i+1;
     if(i<=n)
     System.out.print(i);
     i=i+1;
     if(i<=n)
     System.out.print(i);
     if(i<n)
       System.out.print(",");
      i=i+1;
    }
  }
}