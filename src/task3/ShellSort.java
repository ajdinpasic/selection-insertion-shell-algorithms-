package task3;

import task1.*;


public class ShellSort extends CommonMethods{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable [] array) {
		
		int h=1;
		while(h<array.length/3) {
			h=3*h+1;
		}
		
		while (h>=1) {
			for (int i=h;i<array.length;i++) {
				
			for (int j=i;j>=h;j-=h) {
				if (array[j].compareTo(array[j-h])<0) {
					swap(array, j, j-h);
				}
			}
		}
		h=h/3;
		
	}
	
	
	}

}
