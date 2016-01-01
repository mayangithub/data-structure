/**
 * 
 */
package edu.pitt.chapter1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hash Tables Class
 * @author yanma 
 * @version 2015-10-10
 * @week 10 1005-1011
 * @category CC150 Chapter 1 Arrays and Strings
 */

public class HashTables {
	public class Student {
		int id;	
		public int getId() {
			return this.id;
		}
	}

	public HashMap<Integer, Student> buildMap(Student[] students) {
		HashMap<Integer, Student> map = new HashMap<Integer, HashTables.Student>();
		for (Student s: students) {
			map.put(s.getId(), s);
		}
		return map;
	}
	
	public ArrayList<String> merge(String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<String>();
		for (String w : words) {
			sentence.add(w);
		}
		for (String w: more) {
			sentence.add(w);
		}
		return sentence;
	}
	
	public String joinWords(String[] words) {
		String sentence = "";
		for (String w: words) {
			sentence = sentence + w;
		}
		return sentence;
	}
	
	public String joinWords1(String[] words) {
		StringBuffer sentence = new StringBuffer();
		for (String w: words) {
			sentence.append(w);
		}
		return sentence.toString();
	}
}
