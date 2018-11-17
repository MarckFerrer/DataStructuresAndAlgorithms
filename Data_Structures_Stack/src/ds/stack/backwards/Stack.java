package ds.stack.backwards;

public class Stack {
	
	//This variable will hold the maximum size of the Stack
	private int maxSize;
	
	//This is the array itself, where the values will be stored
	private String[] stackArray;
	
	//This is the top of the stack, the first value
	private int top;
	
	//The constructor will receive the size of the stack by parameter
	public Stack(String input) {
		this.maxSize = input.length();
		this.stackArray = new String[input.length()];
		this.top = -1;
		
		//This is a loop to automatically insert values on the stack
		//The loop will check all the letters from the word and at every iteration a new letter will be added
		for (int i = 0; i < this.maxSize; i++) {
			String letter = String.valueOf(input.charAt(i));
            push(letter);
		}
	}
	
	public int getMaxSize() {
		return this.maxSize;
	}
	
	//This method will be responsible for adding new numbers to the stack and defining the new top value
	public void push(String j) {
		
		//If the number of elements is equal to the max size of the stack, it wound the added
		
		if (isFull()) {
			System.out.println("Sorry the stack if full!");
		}
		else {
			top++;
			stackArray[top] = j;
		}	
	}
	
	//This method will be responsible for removing a item from the stack and defining the new top value
	public String pop() {
		
		if (isEmpty()) {
			System.out.println("Sorry the stack is already empty");
			return "";
		}
		else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
	}
	
	//This function returns the top of the stack
	public String peak() {
		return stackArray[top];
	}
	
	//This function returns if the stake is empty or not
	public boolean isEmpty(){
		return (top == -1);
	}
	
	//This function returns if the stake is full or not
	public boolean isFull() {
		return (maxSize-1 == top);
	}
}