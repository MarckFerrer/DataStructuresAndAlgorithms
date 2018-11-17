package ds.stack;

public class Stack {
	
	//This variable will hold the maximum size of the Stack
	private int maxSize;
	
	//This is the array itself, where the values will be stored
	private long[] stackArray;
	
	//This is the top of the stack, the first value
	private int top;
	
	//The constructor will receive the size of the stack by parameter
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[size];
		this.top = -1;
	}
	
	public int getMaxSize() {
		return this.maxSize;
	}
	
	//This method will be responsible for adding new numbers to the stack and defining the new top value
	public void push(long j) {
		
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
	public long pop() {
		
		if (isEmpty()) {
			System.out.println("Sorry the stack is already empty");
			return -1;
		}
		else {
			int oldTop = top;
			top--;
			return stackArray[oldTop];
		}
	}
	
	//This function returns the top of the stack
	public long peak() {
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