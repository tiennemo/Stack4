package basic.dev;

import java.util.Stack;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(5);
		
		System.out.println("Initial Stack: " + stack);
		System.out.println("Poped element: " + stack.pop());
		System.out.println("Poped element: " + stack.pop());
		
		System.out.println("Stack after pop operation: " + stack);
		
	}

}