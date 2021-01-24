package ds.heap;

public class Heap {

	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	
	public Heap(int size) {
		this.maxSize = size;
		currentSize = 0;
		heapArray = new Node[size];
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	
	public boolean insert(int key) {
		
		if(maxSize == currentSize) {
			return false;
		}
		
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		
		trickleUp(currentSize);
		
		currentSize++;
		
		return true;
		
	}
	
	public void trickleUp(int idx) {
		
		int parentIdx = (idx-1)/2;
		Node nodeToInsert = heapArray[idx];
		
		while(idx>0 && heapArray[parentIdx].getKey() < nodeToInsert.getKey()) {
			heapArray[idx] = heapArray[parentIdx];
			idx = parentIdx;
			parentIdx = (parentIdx-1)/2;
		}
		
		heapArray[parentIdx] = nodeToInsert; 
		
	}
	
	
	public Node delete() {
		
		Node deletedNode = heapArray[0];
		
		heapArray[0] = heapArray[--currentSize];
		
		
		trickleDown(0);
		
		return deletedNode;
	}
	
	public void trickleDown(int rootIdx) {
		
		int leftChild = rootIdx*2 + 1;
		int rightChild = rootIdx*2 + 2;
		
		
		while(heapArray[rootIdx].getKey() < heapArray[leftChild].getKey() || heapArray[rootIdx].getKey() < heapArray[rightChild].getKey()) {
			
			if(heapArray[leftChild].getKey() > heapArray[rightChild].getKey()) {
				Node temp = heapArray[leftChild];
				heapArray[leftChild] = heapArray[rootIdx];
				heapArray[rootIdx] = temp;
				
				rootIdx = 2*rootIdx + 1;
				leftChild = 2*rootIdx + 1;
				rightChild = 2*rootIdx + 2;
			}
			
			if(heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
				Node temp = heapArray[rightChild];
				heapArray[rightChild] = heapArray[rootIdx];
				heapArray[rootIdx] = temp;
				
				rootIdx = 2*rootIdx + 2;
				leftChild = 2*rootIdx + 1;
				rightChild = 2*rootIdx + 2;
			}
			
		}
	}
	
	
//	public void trickleDown(int idx) {
//		int largerChildIdx;
//		Node top = heapArray(idx);
//		
//		while(idx > currentSize/2) {	//will run as long as idx is not on the bottom row (atleast one child)
//			
//			int leftChildIdx = 2*idx +1;
//			int rightChildIdx = 2*idx +2;
//			
//			if(rightChildIdx < currentSize && heapArray[leftChildIdx].getKey() < heapArray[rightChildIdx].getKey()) {
//				largerChildIdx = rightChildIdx;
//			} else {
//				largerChildIdx = leftChildIdx;
//			}
//			
//			if(top.getKey() >= heapArray[largerChildIdx].getKey()) {
//				break;  //successfully made root the largest key
//			}
//			
//			heapArray[idx] = heapArray[largerChildIdx];
//			idx = largerChildIdx;
//			
//		}
//		heapArray[idx] = top;
//	}
}
