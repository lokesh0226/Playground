import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
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
    int p[]=new int[n];
    int pos=0;
    int count=0;
  for(int i=0;i<n;i++)
  {
  if(arr[i]==0)
  {
  count++;
  }
  
  }
  for(int i=0;i<n;i++){
  if(arr[i]>0)
  {
  p[pos]=arr[i];
  pos++;
  }
  }
  for(int i=0;i<count;i++)
  {
  p[pos]=0;
    pos++;
  }
    
    for(int i=0;i<n;i++)
    {
    System.out.print(p[i]+" ");
    }
  
  }
  
  
  
  
  }
  
  
