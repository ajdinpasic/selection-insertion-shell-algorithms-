package task1;

public abstract class CommonMethods {
	
	@SuppressWarnings("rawtypes")
	public static void swap(Comparable [] array,long a, long b) {
		Comparable temp=array[(int) a];
		array[(int) a]=array[(int) b];
		array[(int) b]=temp;
	}

}
