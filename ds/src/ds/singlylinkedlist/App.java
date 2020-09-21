package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(78);
		myList.insertFirst(11);
		myList.insertLast(1111);
		myList.insertLast(1111090);

		
		myList.displayList();

	}

}
