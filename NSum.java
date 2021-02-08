import java.util.Scanner;
public class NSum {

	public static void main(String[] args) {

        System.out.println("Input the value of n till which you want the sum:");          
        Scanner s=new Scanner(System.in);
          
            double n= s.nextDouble();
		
		int sum=0;
		int i;
		
		for(i=0;i<=n;i++)
		{
		  sum=sum+i;
		}
     System.out.println("Sum of first "+n+" natural numbers : "+sum);
     
	}

}


