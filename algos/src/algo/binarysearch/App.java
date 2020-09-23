package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		
		
		int[] arr = {2,11,32,55,64,78,91,102};		// HAS TO BE SORTED
		
		System.out.print(recursiveBinarySearch(arr, 0, arr.length-1, 91 ));
		
	}
	
	public static int binarySearch(int[] a, int val) {
		
		int x,y,k;
		
		x=0;
		y=a.length-1;
		k=0;
		
		while(x<=y) {
			
			k=(x+y)/2;
			
			if(a[k]==val) {
				return k;
			}
				
			else if(a[k]>val) {
				y=k-1;
			} 
			
			else {
				x=k+1;
			}
				
		}
		
		return -1;
	}

	
	public static int recursiveBinarySearch(int[] a, int x, int y, int val) {
		
			
		if(x>y) {
			return -1;
		}
			
		else {		
			int t = (x+y)/2;
			
			if(a[t] == val) {
				return t;
			}
			
			else if(val>a[t]) {
				return recursiveBinarySearch(a, t+1, y, val);
			}
			
			else{
				return recursiveBinarySearch(a, x, t-1, val);
			}
		}
		
	}
	
}
