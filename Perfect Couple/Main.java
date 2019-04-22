import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=in.nextInt();
      }
      int s=in.nextInt();
      funt(arr,n,s);
      
      
    }
  public static void funt(int arr[],int n,int s)
  {
    int sum;
  for(int i=0;i<(n-1);i++)
  {
  for(int j=i+1;j<n;j++)
  {
  sum=arr[i]+arr[j];
  if(sum==s)
  {
  System.out.println(arr[i]+", "+arr[j]);
  
  }
  }
  
  
  }
    
    
  
  
  
  }
  
  
  
}