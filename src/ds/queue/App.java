package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		
		myQueue.insert(50);
		myQueue.insert(505);
		myQueue.insert(502);
		myQueue.insert(504);
		myQueue.insert(501);
		myQueue.view();
		
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());

		myQueue.view();
	}

}
