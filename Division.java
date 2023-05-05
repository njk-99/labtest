package exception_handling;
import java.util.*;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of x and y");
		int x=s .nextInt();
		int y=s .nextInt();
		try {
		if(y==0)
		{
			throw new ArithmeticException("Division by zero is not allowed");
		}
		System.out.println("Result:" +(x/y));
		}catch(ArithmeticException e) {
			System.out.println("Error"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Error: invalid input");
		}
		s.close();
	}
}


