package assignment2;
import java.util.Scanner;
public class greatest 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Numbers: ");
		int a=s.nextInt();
		System.out.print("Enter Second Numbers: ");
		int b=s.nextInt();
		System.out.print("Enter Third Numbers: ");
		int c=s.nextInt();
		int result= ( a>b ? (a>c?a:c) : (b>c?b:c));
		System.out.print("Greatest Number Is:"+result);
		
		

	}


}
