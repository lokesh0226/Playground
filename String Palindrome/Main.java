import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      StringBuilder temp=new StringBuilder("");
      int l=sb.length();
      int count=0;
      for(int i=(l-1);i>=0;i--)
      {
      char ch=sb.charAt(i);
      temp.append(ch);
      
      }
      for(int i=0;i<l;i++)
      {
        if(temp.charAt(i)==sb.charAt(i))
        count++;
      }
      if(count==l)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}