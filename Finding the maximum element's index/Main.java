import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=in.nextInt();
    }
    funt(arr,n);
  }
  public static void funt(int arr[],int n)
  {
    int s=0;
    int p=0;
  for(int i=0;i<n;i++)
  {
  if(s<arr[i])
  {s=arr[i];
  p=i;}
  }
  
  System.out.println(p);
  
  }
}