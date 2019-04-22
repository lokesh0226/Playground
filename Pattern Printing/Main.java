import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner (System.in);
      int row=in.nextInt();
      int col=in.nextInt();
      int save1=row;
      int save2=row;
      for(int i=1;i<=row;i++)
      {
      for(int j=1;j<=i;j++)
      {
      System.out.print(save1);
        save1--;
      
      }
        save1=row;
      for(int k=i+1;k<=col;k++)
      {
      System.out.print(save2);
      
      }
        save2--;
        System.out.println("");
      }
    }
}