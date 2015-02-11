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
		
		String scoreString = scores.toString();
		System.out.println(scores.numEntries + "  jack  " + scoreString);
		
		scores.addUnique(jill);
		System.out.println(scores.numEntries + " jill " + scores.toString());
		
		scores.addUnique(rose);
		System.out.println(scores.numEntries + " rose " + scores.toString());
		
		scores.addUnique(rob);
		System.out.println(scores.numEntries + " rob " + scores.toString());
		
		scores.addUnique(mike);
		System.out.println(scores.numEntries + " mike " + scores.toString());
		
		scores.addUnique(anna);
		System.out.println(scores.numEntries + " anna " + scores.toString());

		scores.addUnique(paul);
		System.out.println(scores.numEntries + " paul " + scores.toString());

		scores.addUnique(mike);
		System.out.println(scores.numEntries + " mike " + scores.toString());
		
		scores.addUnique(rob);
		System.out.println(scores.numEntries + " rob " + scores.toString());
		
		scores.addUnique(anna);
		System.out.println(scores.numEntries + " anna " + scores.toString());
		
		scores.addUnique(sue);
		System.out.println(scores.numEntries + " sue " + scores.toString());
		
		scores.addUnique(sue);
		System.out.println(scores.numEntries + " sue " + scores.toString());
		
		scores.addUnique(john);
		System.out.println(scores.numEntries + " john " + scores.toString());
		
		
		
	}

}
