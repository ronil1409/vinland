package assignment2;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr First Number: ");
		int m=s.nextInt();
		System.out.print("Enetr First Number: ");
		int n=s.nextInt();
		
		System.out.println("Menu 1 Add  \n     2 Substract \n     3 Multiply \n     4 Divide");
		int a=s.nextInt();
		switch(a)
		
		{
		case 1  : System.out.println("Addition  :"+(m+n));
		          break;
		case 2  : System.out.println("Substraction :"+(m-n));
		          break;
		case 3  : System.out.println("Multiply  :"+(m*n));
		          break;
		case 4  : System.out.println("Divition  :"+(m/n));
		          break;
		default :System.out.println("Wrong Entry :(");
		}
		s.close();

	}


}
