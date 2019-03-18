package Package1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String args[]) throws IOException
	{

		ServerSocket s1 = new ServerSocket(8028);
		Socket ss = s1.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		PrintStream p = new PrintStream(ss.getOutputStream());
}
}
