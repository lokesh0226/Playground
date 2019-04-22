import java.util.Scanner;
import java.lang.Math;
class Main{
public static void main(String []args)
{
Scanner in =new Scanner(System.in);
  int expo=in.nextInt();
  int base=in.nextInt();
int p=power(expo,base);
System.out.println(p);
}
  public static int power(int a,int b)
  {int pwr=1;
  while(b!=0)
  {
  pwr=pwr*a;
  b=b-1;
  }
    
  return pwr;
  }



}