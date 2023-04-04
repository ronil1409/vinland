package assignment2;
import java.util.Scanner;

public class odd_even 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=s.nextInt();
		int even=0,odd=0;
	    do
	    {
	    	int p=a%10;
	    	a=a/10;
	    	if(p%2==0) {
	    		      even=even+p;
	    	         }
	    	else
	    		{
	    		 odd=odd+p;
	    		}
	    }while(a!=0);
	    System.out.println("Sum Of The Even Numbers: "+even);
	    System.out.println("Sum Of The odd  Numbers: "+odd);
		
		s.close();
		

	}	

}
