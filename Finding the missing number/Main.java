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
      missing(n,arr);
    }
  public static void missing(int n,int arr[])
  {
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    a[i]=i+1;
    }
    int c;
  for(int i=0;i<n;i++)
  {
  for(int j=0;j<n;j++)
  {
    if(a[i]==arr[j])
    {
      a[i]=0;
    }  
  }
  }
    for(int i=0;i<n;i++)
    {
 if(a[i]>0)
 {
 System.out.print(a[i]);}
    }
  
  }
}