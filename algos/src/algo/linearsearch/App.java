package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		
		

	}
	
	public static int linearSearch(int a[], int val) {
	
		for(int i=0 ; i<a.length ; i++) {
			if(a[i]==val)
				return i;;
		}
		
		return -1;
	}

}
