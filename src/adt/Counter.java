package adt;

public class Counter {
	private String name = "";
	private int counter=0;

	public Counter(String name) {
		this.name=name;
		
	}
	public void incremeant() {
		
		counter++;
	}
	public int getValue() {
		
		return counter;
	}
	@Override
	public String toString() {
		return "Counter [name=" + name + ", counter=" + counter + "]";
	}
	
}


