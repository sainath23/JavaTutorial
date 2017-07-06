package linearDS;

public class MyLinkedList {
	//Properties
	int count;
	Node head;
	
	//Constructor to create empty head node
	/*public MyLinkedList() {
		head = null;
		count = 0;
	}*/
	
	//Constructor to create head node using given head node
	public MyLinkedList(Node head) {
		this.head = head;
		count = 1;
	}
	
	//Methods
	
	//Add
	public void add(int data) {
		Node tempNode = new Node(data);
		Node currentNode = head;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(tempNode);
		count++;
	}
	
	//Get
	public int get(int index) {
		if(index <= 0) {
			return -1;
		}
		Node currentNode = head;
		for(int i=1; i<index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}
	
	//size
	public int size() {
		return count;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	//remove
	public void remove() {
		Node currentNode = head;
		while(currentNode.getNext().getNext() != null) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(null);
		count--;
	}
	
	public static void main(String[] args) {
		//MyLinkedList mll = new MyLinkedList(10);
	}

}
