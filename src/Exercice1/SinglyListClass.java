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
	
	
	
	
	public Node getHeader() {
		return header;
	}
	
	public void setHeader(Node header) {
		this.header = header;
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
		System.out.println("Test2 (5): " + maListe.getHeader());
		//test 3 : ajoute 2 éléments a la suite.
		maListe.addLast(5);
		maListe.addLast(2);
		maListe.addLast(7);
		System.out.println("Test 3 (5-2-7)"+ maListe.getHeader());
	}
	
	
}
