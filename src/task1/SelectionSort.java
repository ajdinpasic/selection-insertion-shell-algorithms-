package task1;

public class SelectionSort extends CommonMethods{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sort(Comparable [] array) {
		
		for (int i=0;i<array.length;i++) {
			int min=i;
			for (int j=i+1;j<array.length;j++) {
				if (array[j].compareTo(array[min])<0) {
					min=j;
				}
			}
			swap(array,i,min);
		}
		
	}
	

}
