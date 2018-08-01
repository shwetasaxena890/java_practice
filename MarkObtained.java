import java.util.Scanner;

public class MarkObtained
{
  public static void main(String[] args)
{
  int markObtained, passingMarks;
    
  passingMarks= 40;


  Scanner input = new Scanner(System.in);
 
   System.out.println("Input marks");
 
   markObtained = input.nextInt();
   


  if(markObtained>= passingMarks)
  {
  System.out.println(" you passed the exam");
  }
  

  else
{
  System.out.println("you failed the exam");

}

}

}