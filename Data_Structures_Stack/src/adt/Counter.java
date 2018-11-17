package adt;

public class Counter {
	
	int value = 0;
	
	public Counter(int number) {
		this.value = number;
	}
	
	public void increment() {
		this.value++;
	}
	
	public int getCurrentValue() {
		return this.value;
	}
	
	public void toStringMethod() {
		System.out.println("The current value is: "+this.value);
	}
}