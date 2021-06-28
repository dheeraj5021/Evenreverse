import java.util.Scanner;
public class Evenreverse
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int i,m;
   i=sc.nextInt();
   m=sc.nextInt();
   while(i>=m)
    { 
     if(i%2==0)
      {
      System.out.println("the numbers are"+i);
      }
      i--;
    }
  }
}