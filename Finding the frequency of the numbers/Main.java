import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
      arr[i]=in.nextInt();
      }
      int temp[]=new int[k];
      for(int i=0;i<k;i++)
      {
      temp[i]=0;
      }
      for(int i=0;i<n;i++)
      {
      temp[arr[i]-1]++;
      }
      for(int i=0;i<k;i++)
      {
      System.out.println(i+1+" "+temp[i]);
      }
    }
}