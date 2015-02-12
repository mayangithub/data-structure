package edu.pitt.array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scores scores = new Scores();
		
		GameEntry[] listEntries = scores.entries;
		
		GameEntry mike = new GameEntry("Mike", 1105);
		GameEntry rob = new GameEntry("Rob", 750);
		GameEntry paul = new GameEntry("Paul", 720);
		GameEntry anna = new GameEntry("Anna", 660);
		GameEntry rose = new GameEntry("Rose", 590);
		GameEntry jack = new GameEntry("Jack", 510);
		GameEntry jill = new GameEntry("Jill", 740);
		GameEntry sue = new GameEntry("Sue", 200);
		GameEntry john = new GameEntry("John", 200);
		
		scores.addUnique(jack);
		scores.addUnique(jill);
		scores.addUnique(rose);
		scores.addUnique(rob);
		scores.addUnique(mike);
		scores.addUnique(anna);
		scores.addUnique(paul);
		scores.addUnique(mike);
		scores.addUnique(rob);
		scores.addUnique(anna);
		scores.addUnique(sue);
		scores.addUnique(sue);
		scores.addUnique(john);
		System.out.println(scores.toString());
		
		
		scores.remove(3);
		System.out.println(scores.toString());
		scores.remove(5);
		System.out.println(scores.toString());
		
		char[] array = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};
		scores.insertionSort(array);
		
		
		/**
		 * Some simple methods of java.util.Arrays
		 */
		
		int[] A = {1,2,3,4,5,6};
		int[] B = {2,3,4,5,6,7};
		int[] C = {1,3,5,7,9,6};
		
		boolean equal = java.util.Arrays.equals(A, B);
		System.out.println("Is A and B equal? " + equal);
		
		int[] D = new int[8];
		java.util.Arrays.fill(D, 3);
		System.out.println("D: " + java.util.Arrays.toString(D));
		
		D = java.util.Arrays.copyOf(A, 3);
		System.out.println("D: " + java.util.Arrays.toString(D));
		
		D = java.util.Arrays.copyOf(A, 8);
		System.out.println("D: " + java.util.Arrays.toString(D));
		
		D = java.util.Arrays.copyOfRange(A, 2, 10);
		System.out.println("D: " + java.util.Arrays.toString(D));
		
		int[] E = {23,67,45,36,92,38,74,59};
		java.util.Arrays.sort(E);
		System.out.println("E: " + java.util.Arrays.toString(E));
	}

}
