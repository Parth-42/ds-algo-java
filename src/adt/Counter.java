package adt;

public class Counter {
	
	private String name = null;
	private int count=0;
	
	public Counter(String name) {
		this.name = name;
	}

	
	public void increment() {
		count++;
	}
	
	public int getCurrentValue() {
		return count;
	}
	
	public String toString() {
		return name + ": " + count;
	}
	
}
