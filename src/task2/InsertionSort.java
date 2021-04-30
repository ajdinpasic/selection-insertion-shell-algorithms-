package task2;

import task1.*;


public class InsertionSort extends CommonMethods{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable [] array) {
		for (int i=0;i<array.length;i++) {
			for (int j=i;j>0;j--) {
				if (array[j].compareTo(array[j-1])<0) {
					swap(array, j, j-1);
				} else {
					break;
				}
			}
		}
	}
	
	

}
