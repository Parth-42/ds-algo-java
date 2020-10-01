package algo.quicksort;

public class QuickSort {
	
	public void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] a, int start, int end) {
		
		if(start<end) {
			int p = partition(a, start, end);
			quickSort(a, start, p-1);	//sorts left half 
			quickSort(a, p+1, end);		//sorts right half
		}
		
	}
	
	public static int partition(int[] a, int start, int end) {
		
		int p = end;
		int i=start-1;
		
		for(int j=start ; j<end ; j++) {
			if(a[j] <= a[p]) {
				i++;
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;			
			}
		}
		
		//putting pivot value in correct position
		i++;
		int temp = a[p];
		a[p] = a[i];
		a[i] = temp;
		
		return i;
	}
	
}
