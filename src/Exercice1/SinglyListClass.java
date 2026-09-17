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
		this.header = header;
		size = 1;
	}
	
	
	
	
	public Node getHeader() {
		return header;
	}
	
	public void setHeader(Node header) {
		this.header = header;
	}
	
	@Override
	public String toString() {
	    StringBuilder str = new StringBuilder("Chain[");
	    if (header != null) {
	        Node currentNode = header;

	        for (long i = 1; i <= size; i++) {
	            str.append(currentNode.getElement());

	            if (i < size) {
	                str.append(" ");
	            }
	            currentNode = currentNode.getNext();
	        }
	    }
	    str.append("]");
	    return str.toString();
	}
	
	
	public void addLast(Integer element) {

	    Node newNode = new Node(element);

	    if (header == null) {
	        header = newNode;
	        size++;
	        return;
	    }

	    Node tmpHeader = header;

	    while (tmpHeader.getNext() != null) {
	        tmpHeader = tmpHeader.getNext();
	    }

	    tmpHeader.setNext(newNode);
	    size++;
	}
	
	public void addFirst(Integer element) {
		this.size++;
		Node newElement = new Node(element, this.header);
		this.header = newElement;
		
	}
	
	
	
	public long size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	
	public Integer first() {
		if(isEmpty()) {
			return null;
		}
		return header.getElement();
	}
	
	public Integer last() {
		if(isEmpty()) {
			return null;
		}
		Node current = header;

	    while (current.getNext() != null) {
	        current = current.getNext();
	    }
	    return current.getElement();
	}
	
	
	
	// Class Node
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
	
	
	
	public static void main(String[]args) {
		SinglyListClass maListe = new SinglyListClass();
		System.out.println(maListe);
		//test 2 : juste 5
		maListe.addLast(5);
		System.out.println("Test2 (5): " + maListe);
		//test 3 : ajoute 2 éléments a la suite.
		maListe.addLast(2);
		maListe.addLast(7);
		System.out.println("Test 3 (5-2-7)"+ maListe);
		//test 4 : isEmpty et size
		System.out.println(maListe.size());
		System.out.println(maListe.isEmpty());
		//test 5 : first et last
		System.out.println(maListe.first());
		System.out.println(maListe.last());
		//test 6 : addFirst
		System.out.println(maListe.addFirst(9));
		
	}
	
	
}
