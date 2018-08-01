import java.util.Scanner;
public class EvenOdd
{

  public static void main( String[]args)
 
{

  int x; 
  System.out.println(" Enter the number x");
  
  Scanner in= new Scanner(System.in);
  x = in.nextInt();

  if (x % 2==0)
  System.out.println( x + " is even");
  else
  System.out.println( x + " is odd");
    }
}
  
  