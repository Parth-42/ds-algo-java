package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		
		
		int[] arr = {2,11,32,55,64,78,91,102};
		
		System.out.print(binarySearch(arr, 55));
		
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

}
