import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
    Scanner in=new Scanner (System.in);
      int c1=0,c2=0;
      int p1=0,p2=0;
      int arr_size=in.nextInt();
      int arr[]= new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
      arr[i]=in.nextInt();
      }
      int s1=in.nextInt();
      int s2=in.nextInt();
      for(int i=0;i<arr_size;i++)
      {
      if(arr[i]==s1)
      {
      p1=i;
        c1++;
      }
        if(arr[i]==s2)
      {
      p2=i;
        c2++;
      }
      
      
      }
      if(c1>0)
        System.out.println(p1);
      else
        System.out.println(-1);
      
      if(c2>0)
        System.out.println(p2);
      else
        System.out.println(-1);
      
      
    }
}