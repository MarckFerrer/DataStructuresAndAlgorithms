package ds.stack;

public class App {

	public static void main (String args[]) {
		Stack theStack = new Stack(10);
		
		int decrement = theStack.getMaxSize();
		int increment = 1;
		
		while (decrement != -1) {
			theStack.push(increment);
			//increment = increment*2;
			//decrement--;
		}
		
		System.out.println("----------------------");
		
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(" - " + value);
		}
		
	}
	
	public static String reverseString(String str) {
		
		return str;
	}

}