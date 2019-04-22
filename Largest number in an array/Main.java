import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++)
      {
      arr[i]=in.nextInt();
      }
      int large=0;
      for(int i=0;i<s;i++)
      {
      if(large<arr[i])
      {
      large=arr[i];
      
      
      }
      
      }
      
      System.out.println(large);
    }
}