import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int count=1;
      for(int i=1;i<=num;)
      {
      if(count%2!=0)
      {
         System.out.println(count);
        i=i+1;
      
      }
        count=count+1;
      }
	}
}