import java.util.Scanner;
 
  public class Division{

   public static void main(String ar[]){
    
      Scanner s = new Scanner(System.in);
      System.out.println("Input first number");
      double num1 = s.nextDouble();
      System.out.println("Input second number");
      double num2 = s.nextDouble();
       double result=num1/num2;
     
    
    try
    {
      System.out.println("The result of division is :" +result);
    }    
    catch(ArithmeticException e)
    {
     System.out.println("A number cannot be divided by zero"+e);
    } 
 }
}

