package assignment2;
import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) 
	
	{
	int firstterm=0,secondterm=1,nextterm;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value:");
	int n=s.nextInt();
	for(int i=1;i<=n;++i)
	{
	  System.out.print(firstterm+", ");
	  nextterm=firstterm+secondterm;
	  firstterm=secondterm;
	  secondterm=nextterm;
	}
		

	}

}
