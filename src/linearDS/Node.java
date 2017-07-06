package linearDS;

public class Node {
	//Properties or instance variables
	private int data;
	private Node next;
	
	//Constructor for node with only data
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	//Constructor for node with data and reference to next node
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	//Getters and Setters
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
}
