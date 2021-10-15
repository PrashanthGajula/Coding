package javaObjectOriented;

public class MyStack {
	int maxSize;
	int[] stackArray;
	int top;
	
	public MyStack(int s) {
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public void push(int i) {
		if(!isFull()) {
			top = top+1;
			stackArray[top]=i;
		} else {
			System.out.println("stack is full");
		}
	}
	
	public int pop() {
		int x = stackArray[top];
		top=top-1;
		return x;
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top ==-1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	
	public static void main(String[] args) {
	      MyStack theStack = new MyStack(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      
	      while(!theStack.isEmpty()) {
	    	  System.out.println(theStack.pop());
	      }
	}
}
