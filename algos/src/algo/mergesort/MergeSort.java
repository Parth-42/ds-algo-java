package algo.mergesort;

public class MergeSort {
		
	public void sort(int[] array) {
		sort(array, 0, array.length-1);
	}
	
	public static void sort(int[] arr, int start, int end) {
			
		if(start>=end) {
			return; // we're done traversing the array
		}
		
		int mid = (start+end)/2;
		
		sort(arr, start, mid);		//sort left half
		sort(arr, mid+1, end);		//sort right half
		merge2(arr, start, mid, end);	// merge sorted results into the inputArray
		
	}
	
	public static void merge(int[] a, int start, int mid, int end) {		//Method using 2 temp arrays
		
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];				
		
		for(int i=0; i<n1 ; i++) {
			left[i] = a[start+i];
		}
		
		for(int i=0; i<n2 ; i++) {
			right[i] = a[mid+1+i];
		}
		
		int i=0,j=0;
		int k=start;
		
		while(i<n1 && j<n2) {
			if( left[i] < right[j] ) {
				a[k]=left[i];
				i++;
			}
			else {
				a[k]=right[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void merge2(int[] inputArray, int start, int mid, int end) {			//Method using only a single temp array
		
		int tempArray[] = new int[end-start+1];
		
		int leftSlot = start;
		int rightSlot = mid+1;
		
		int k=0;
		
		while(leftSlot <= mid && rightSlot <= end) {
			
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		if(leftSlot <= mid) {
			while(leftSlot<=mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}	
		} else if( rightSlot <=end) {
			while(rightSlot<=end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
			
		}
		
		for(int i=0 ; i< tempArray.length ; i++) {
			inputArray[start + i] = tempArray[i];
		}
		
		
	}	
}
