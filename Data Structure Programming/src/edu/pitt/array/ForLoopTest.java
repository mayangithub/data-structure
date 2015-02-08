package edu.pitt.array;

public class ForLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int i = 0;
		for (; i<10; ++i) { //in for loop, the increment i++ is equal to ++i
			num += 1;
			System.out.println("i: " + i + " number: " + num);
			int cur = --num;
			//System.out.println("i: " + i + " number: " + num + " cur: " + cur);
		}
		System.out.println("i: " + i + " number: " + num);
		
	}

}
