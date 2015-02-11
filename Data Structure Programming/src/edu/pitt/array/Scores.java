package edu.pitt.array;

/**
 * Scores class
 * to include functions of array
 * @author yanma
 * @since 2015-02-10
 */

public class Scores {
	public static final int maxEntries = 10;
	protected int numEntries;
	protected GameEntry[] entries;
	
	public Scores() {
		entries = new GameEntry[maxEntries];
		numEntries = 0;
	}
	
	public String toString() {
		String s = "[";
		for (int i=0; i < numEntries; i++) {
			if (i > 0) {
				s += ", ";
			}
			s += entries[i];
		}
		s += "]";
		return s;
	}
	
	/**
	 * add new score entry into the score list
	 * @param e GameEntry object, with score and name
	 * 
	 * Notice:
	 * 1. check whether the list is full or not, 
	 * 	if the list is full, check with the last entry score, 
	 * 		if new entry is smaller than last entry, the array doesn't change;
	 * 	otherwise, the new entry will be inserted into the array, 
	 * 	increase the number of entries first, to avoid the out of array boundary exception
	 * 	then, find the proper position for the entry
	 * 2. compare the new entry with the second entry from the very last entry
	 * 	if the new entry is larger, copy the last second entry to the last position 
	 * 	and compare the new entry with the third element from the rear and move forward.
	 * 	until, 
	 * 	the new entry is the smaller one, add the new entry to the current location
	 * 	insertion is done.
	 */
	
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		if (numEntries == maxEntries) {
			if (newScore <= entries[numEntries - 1].getScore()) {
				return;
			}
		} else {
			numEntries++;
		}
		int i = numEntries - 1;
		
		for (; (i >= 1 && newScore >= entries[i - 1].getScore()); i--) {
			entries[i] = entries[i - 1];
		}
		entries[i] = e;
		
	}
	
	
	/**
	 * only insert a unique high score of an unique player
	 * avoid the same score from same player
	 * if the new score is equal the smallest score, no change
	 * if the new score is equal to other score, insert this entry
	 * 
	 * @param e the entry object to be inserted
	 * 
	 * include a search process
	 * if didn't find the same entry, insert
	 * otherwise, no change
	 * 
	 * the search process should be improve by other algorithms
	 */
	public void addUnique(GameEntry e) {
		int newScore = e.getScore();
		
		/**
		 * empty array, insert directly
		 */
		if (numEntries == 0) {
			entries[0] = e;
			numEntries++;
			return;
		}
		
		/**
		 * new score is not high enough, no change
		 */
		if (numEntries == maxEntries) {
			if (newScore <= entries[numEntries-1].getScore()) {
				return;
			}
		}
		
		/**
		 * if the new score is the same with the lowest score
		 * although the array is not full
		 * no change
		 */
		if(newScore == entries[numEntries-1].getScore()) {
			return;
		}
		
		/**
		 * find whether the entry existed
		 * if found, no change
		 * if not, go on the program
		 * stop comparing when meet higher score
		 * means not existed
		 */
		for (int i = numEntries - 1; i >= 0 && newScore >= entries[i].getScore(); i--) {
			//System.out.println("larger");      //when the entry is larger than e, stop checking, no duplicate
			if (entries[i].equals(e)) {
				return;
			}
		}
		
		/**
		 * if not existed
		 * execute the add(e) functions
		 */
		numEntries++;
		
		int i = numEntries - 1;
		for (; i>=1 && newScore > entries[i-1].getScore(); i--) {
			entries[i] = entries[i-1];
		}
		entries[i] = e;
	}
	
	
}
