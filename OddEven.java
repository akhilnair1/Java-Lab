import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
        
        System.out.println("Input the number to be checked :");          
        Scanner s=new Scanner(System.in);
         
            int num= s.nextInt();
		
		 if(num%2==0)
		  {
			 System.out.println(""+num+" is an Even number.");
		  }
		 else
		 {
			 System.out.println(""+num+" is an Odd number.");
		 }
		 
	}

}
