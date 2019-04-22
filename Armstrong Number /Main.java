import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num = in.nextInt();
      //int l=num;
      int r,q;
     // int count=0;
      int sum=0;
     /* while(l>0)
      {
        //r=l%10;
        l=l/10;
        count=count+1;
      
      }*/
      int y=num;
      while(y>0)
      {
      q=y%10;
        y=y/10;
        sum=sum+q*q*q;
      
      
      
      }
      if(sum==num)
        System.out.println("Armstrong Number");
	else
      System.out.println("Not a Armstrong Number");
    
    }
}