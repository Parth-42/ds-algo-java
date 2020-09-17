package ds.singlylinkedlist;

public class SinglyLinkedList {
	
	private Node first;
//	private Node last;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first==null);
			
	}
	
	//user to insert at the beginning
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		
//		if( newNode.next == null)
//			last= newNode;
		
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first --> last) ");
		
		Node current = first;
		while(current!=null) {
			current.displayNode();
			current = current.next;
		}
		
	}
	
	public void insertLast(int data) {
		Node current = first;
		
		while(current.next != null) {
			current = current.next;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
	
//	public void insertLast(int data) {
//		Node newNode = new Node();
//		newNode.data = data;
//		last = newNode;
//	}
}
