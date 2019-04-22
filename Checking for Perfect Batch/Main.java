import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    
    Scanner in=new Scanner (System.in);
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
    boolean flag=true;
    int Csum;
  int Asum=arr[0]+arr[1]+arr[2];
  for(int i=3;i<n;i=i+3)
  {
  Csum=arr[i]+arr[i+1]+arr[i+2];
   if(Asum!=Csum)
     flag=false;
 
  }
    if(flag==true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}