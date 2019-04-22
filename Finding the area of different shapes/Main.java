import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      switch(num)
      {
        case 1:
          {
          int side=in.nextInt();
            System.out.println(side*side);
          break;
          }
        case 2:
          {
             int dim1=in.nextInt();
            int dim2=in.nextInt();
            System.out.println(dim1*dim2);
          break;
          }
        case 3:
          {
          int base=in.nextInt();
            int height=in.nextInt();
            double result=(0.5)*base*height;
            System.out.println(result);
            break;
          
          
          }
        case 4:
          {
          float rad=in.nextFloat();
            double area=(3.14)*rad*rad;
            System.out.println(area);
          break;
          }
            default :
            {
            System.out.println("Enter valid option");
            break;
            }
          
          
          
      }
    }
}