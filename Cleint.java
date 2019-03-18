package Package1;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		int Number1, Number2;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",8028);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter the first number");
		Number1 = sc.nextInt();
		int temp = Number1;
		System.out.println("Enter the second number");
		Number2 = sc.nextInt();
		
			temp = Number1*Number2;
		
			System.out.println("Result of " + Number1 + " multiplied with " + Number2 + " is " + temp);;
			
			System.out.println("Enter the first number");
			Number1 = sc.nextInt();
			int temp1 = Number1;
			System.out.println("Enter the second number");
			Number2 = sc.nextInt();
			
				temp1 = Number1+Number2;
				System.out.println("Sum of " + Number1 + " and " + Number2 + " is " + temp1);;
				
				System.out.println("Enter the first number");
				Number1 = sc.nextInt();
				int temp2 = Number1;
				System.out.println("Enter the second number");
				Number2 = sc.nextInt();
				
					temp2 = Number1-Number2;
					System.out.println("Result of " + Number1 + " from " + Number2 + " is " + temp2);;
					
					System.out.println("Enter the first number");
					Number1 = sc.nextInt();
					int temp3 = Number1;
					System.out.println("Enter the second number");
					Number2 = sc.nextInt();
					
						temp3 = Number1/Number2;
						System.out.println(" Divide from " + Number1 + " number " + Number2 + " and result is " + temp3);;
}
}
