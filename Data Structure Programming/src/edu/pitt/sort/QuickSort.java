/**
 * 
 */
package edu.pitt.sort;

/**
 * Quick sort
 * @author yanma
 * @version 2015-10-12
 */
public class QuickSort {
	public static void quicksort(int[] A, int low, int hi) {
		if (low < hi) {
			int p = partition(A, low, hi);
			quicksort(A, low, p - 1);
			quicksort(A, p + 1, hi);
		}
	}
	
	public static int partition(int[] A, int low, int hi) {
		int pivot = A[hi];
		int i = low; // i: first number larger than pivot
		for (int j = i; j < hi; j++) {
			if (A[j] <= pivot) {
				swap(A, i, j);
				i++;
			}
		}
		swap(A, i, hi);
		return i;
	}
	
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] A1 = {4,5,1,2,3};
		int[] A2 = {7,9,4,5};
		quicksort(A1, 0, A1.length - 1);
		for (int i : A1) {
			System.out.print(i + ", ");
		}
		System.out.println("");
		quicksort(A2, 0, A2.length - 1);
		for (int i : A2) {
			System.out.print(i + ", ");
		}
	}
}
