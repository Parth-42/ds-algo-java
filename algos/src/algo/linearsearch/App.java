package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {4,5,32,6,3,35,7,22,53,64,91}, 0, 53));
		

	}
	
	public static int linearSearch(int a[], int val) {
	
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]==val)
				return i;;
		}
		
		return -1;
	}

	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		
		if(i>a.length-1) {
			return -1;
		}
		
		else if(a[i]==x) {
			return i;
		}
		
		else
			return recursiveLinearSearch(a, i+1, x);
		
		
	}
}
