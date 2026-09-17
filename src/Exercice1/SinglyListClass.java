package Exercice1;

public class SinglyListClass {

	private Node header;
	private long size;
		
	
	public SinglyListClass() {
		header = null;
		size = 0; 
	}
	
	public SinglyListClass(Node header) {
		this();
		header = header;
		size = 1;
	}
	
	
	public void addLast(Integer element) {
		Node newNode = new Node(element);
		if (header == null) {
			header = newNode;
			size++;
			return;
		}
	}
	
	private static class Node {
		
		// Var
		private Integer element;
		private Node next;
		
		public Node(Integer element) {
			this.element = element;
		}
		
		//Constructor
		public Node (Integer s, Node n) {  
			this.element = s;
			this.next = n;
		}
		
		public Integer getElement() {
			return element;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setElement(Integer newElement) {
			element = newElement;
		}
		
		public void setNext(Node newNext) {
			next = newNext;
		}

		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next + "]";
		}
		
	}
	
	
}
