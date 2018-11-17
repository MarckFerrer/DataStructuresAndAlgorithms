package ds.stack.backwards;

import javax.swing.JOptionPane;

public class App {

	public static void main (String args[]) {
		
		//This is a small pop-up window where the user can insert the word
		String userInput = JOptionPane.showInputDialog("Write a word" );
		//Here the variable is declared and instantiated
		Stack theStack = new Stack(userInput);
		
		/*
		 * This is a basic loop that checks if the stack is empty.
		 * If it's not, i'll keep showing the values and removing them
		 */
		while (!theStack.isEmpty()) {
			String value = theStack.pop();
			System.out.print(value);
		}
	}
}