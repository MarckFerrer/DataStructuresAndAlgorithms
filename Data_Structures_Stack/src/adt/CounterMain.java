package adt;
import java.util.Scanner;

public class CounterMain {
	
	public static void main(String args[]) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		int n = 0;
		
		while (n <= 10) {
			
			System.out.println("Enter a number for your conter: ");
			n = reader.nextInt(); // Scans the next token of the input as an int.
			
			if (n == 0) {
				
				String answer;
				System.out.println("Are you sure?");
				answer = reader.nextLine();
				answer = reader.nextLine();
				
				if (answer.equals("yes")) {
					System.out.println("Ok, see ya!");
					reader.close();
					System.exit(0);
				}
			}
			else {
				
				Counter counter1 = new Counter(n);
				counter1.increment();
				counter1.toStringMethod();
				
			}
		}
	}
}