import java.util.Scanner;
public class SwapNumber
{
public static void main (String[]args)
{ 
  int a,b,swap;
  System.out.println("enter a and b");
  
  Scanner in = new Scanner(System.in);

  a = in.nextInt();
  b = in.nextInt();

  System.out.println("before swapping\nx= "+a+"\ny="+b);

   swap=a;
   a=b;
   b=swap;

  System.out.println("after swapping\nx= "+a+"\ny="+b);
}
 }
   
  