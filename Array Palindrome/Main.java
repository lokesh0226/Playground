import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=in.nextInt();
      }
      palindrome(n,arr);
    }
  
  public static void palindrome(int n,int arr[])
  {int c=0;
  for(int i=0;i<n;i++)
  {
  if(arr[i]!=arr[(n-1)-i])
  c++;
  }
  if(c>0)
    System.out.print("No");
  else
    System.out.print("Yes");
  }
}