package algo.quicksort;

public class App {

	public static void main(String[] args) {
		
		
		int[] inputArray = {12, 81, 74, 43, 1098, 0, 8 ,92, 17, 754, 912, 0, 6, 4};
		QuickSort sorter = new QuickSort();
		
		sorter.quickSort(inputArray);
		
		for(int i=0; i<inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}

	}

}
