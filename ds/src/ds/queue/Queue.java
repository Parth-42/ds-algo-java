package ds.queue;

public class Queue {
	
		private int maxSize; //initializes the number of slots
		private long[] queArray; //slots to maintain the data
		private int front; //index position for the element in the front.
		private int rear; //index position for the element at the back of the line.
		private int nItems; //counter to maintain the number of items in your queue.
		
		public Queue(int size) {
			this.maxSize = size;
			this.queArray = new long[size];
			front = 0;  //index position of the first slot of the array.
			rear = -1;  // there is no item in the array yet to be considered as the last item.
			nItems = 0; // 0 elements in array initially.
		}
		
		public void insert(long j) {
			
			if(rear == maxSize-1) {
				rear = -1;
			}
			
			rear++;
			queArray[rear] = j;
			nItems++;
		}
		
		public long remove() {
			long val = queArray[front];
			front++;
			
			if(front==maxSize) {
				front=0;
				rear=-1;
			}
				
			nItems--;
			return val;
		}
		
		public boolean isEmpty() {
			return (nItems ==0 );
		}
		
		public boolean isFull() {
			return (nItems == maxSize);
		}
		
		public long peekFront() {
			return queArray[front];
		}
		
		public void view() {
			System.out.print("[ ");
			for(int i=front ; i< queArray.length ; i++) {
				System.out.print(queArray[i] + " ");
			}
			System.out.println("]");
		}
}
