package basic.dev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Deque<Integer> deque = new ArrayDeque<>();
		
		stack.push(2);
		stack.push(4);
		deque.push(2);
		deque.push(4);
		
		List<Integer> list1 = stack.stream().collect(Collectors.toList());
		System.out.println("Using Stack -");
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + " ");
		}
		System.out.println();
		
		List<Integer> list2 = deque.stream().collect(Collectors.toList());
		System.out.println("Using Deque -");
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i) + " ");
		}
		System.out.println();
	}

}