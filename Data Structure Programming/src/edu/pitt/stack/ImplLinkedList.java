/**
 * 
 */
package edu.pitt.stack;

/**
 * Implement Stack using LinkedList
 * @author yanma
 * @version 2016-01-01
 */
public class ImplLinkedList {
	private ListNode head;
	
	public ImplLinkedList() {
		this.head = null;
	}
	
	public void push(int x) {
		ListNode newNode = new ListNode(x);
		newNode.next = head;
		head = newNode;
		System.out.println("Addon is: " + x);
	}
	
	public int pop() {
		if (head == null) {
			System.out.println("stack is Empty.");
			return -1;
		}
		int element = head.value;
		head = head.next;
		System.out.println("pop out is: " + element);
		return element;
	}
	
	public int peek() {
		if (head == null) {
			System.out.println("stack is Empty.");
			return -1;
		}
		System.out.println("peek is: " + head.value);
		return head.value;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			System.out.println("stack is Empty.");
			return true;
		}
		System.out.println("stack is NOT Empty.");
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplLinkedList stack = new ImplLinkedList();
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
