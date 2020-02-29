package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize=size;
		this.stackArray=new  long[maxSize];
		top=-1;
	}
	
	public void push(long value) {
		top++;
		stackArray[top]=value;
	}
	
	public long pop() {
		int old_max=top;
		top--;
		return stackArray[old_max];
	}
  public boolean IsEmpty() {
	  
	  return (top == -1);
  }
  
  
  public boolean IsFull() {
	  
	  return (top == maxSize);
	  
  }
  
  
}
