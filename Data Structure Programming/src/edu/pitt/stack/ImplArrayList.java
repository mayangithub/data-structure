/**
 * 
 */
package edu.pitt.stack;

import java.util.ArrayList;

/**
 * Implement stack by using ArrayList
 * @author yanma
 * @version 2016-01-01
 */
public class ImplArrayList {
	private class Stack {
		private ArrayList<Integer> stack;
		
		public Stack() {
			this.stack = new ArrayList<Integer>();
		}
		
		public void push(int x) {
			stack.add(x);
			System.out.println("Addon is: " + x);
		}
		
		public int pop() {
			if (stack.size() == 0) {
				System.out.println("stack is Empty.");
				return -1;
			}
			int element = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			System.out.println("pop out is: " + element);
			return element;
		}
		
		public int peek() {
			if (stack.size() == 0) {
				System.out.println("stack is Empty.");
				return -1;
			}
			int element = stack.get(stack.size() - 1);
			System.out.println("peek is: " + element);
			return element;
		}
		
		public boolean isEmpty() {
			if (stack.size() == 0) {
				System.out.println("stack is Empty.");
				return true;
			}
			System.out.println("stack is NOT Empty.");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		ImplArrayList impl = new ImplArrayList();
		Stack stack = impl.new Stack();
		stack.push(1);
		stack.pop();
		stack.push(2);
		stack.peek();  // return 2
		stack.pop();
		stack.isEmpty(); // return true
		stack.peek();  // return 2
		stack.pop();
		stack.push(3);
		stack.isEmpty(); 
	}
}
