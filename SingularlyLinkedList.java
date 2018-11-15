package exercise;

public class SingularlyLinkedList<E> {
	// ---------------- nested Node class ----------------
	private static class Node<E> {
		private E element; // reference to the element stored at this node
		private Node<E> next; // reference to the subsequent node in the list

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	} // ----------- end of nested Node class -----------
	
	// instance variables of the SinglyLinkedList
	private Node<E> head = null; // head node of the list (or null if empty)
	private Node<E> tail = null; // last node of the list (or null if empty)
	private int size = 0; // number of nodes in the list

	// constructs an initially empty list
	public SingularlyLinkedList() {	} 
	
	// access methods

	// should return size or number of nodes in the list
	// without using 'size' attribute/variable
	// hint: use a loop until it reaches null
	
	// Exercise R-3.9
	public int size() {
		int numberOfNodes = 0;
		Node <E> n;
		for (n = head; n != null; n = n.getNext()){
			numberOfNodes++;
		}
		return numberOfNodes;
	}
	
	// Exercise R-3.12
	public void rotate(){
		// codes to rotate list...
		 // rotate the first element to the back of the list
			if (tail != null) // if empty, do nothing
				tail = tail.getNext(); // the old head becomes the new tail
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public E first() {
		if (isEmpty())
			return null;
		return head.getElement();
	}
	public E last() { 
		if (isEmpty())
			return null;
		return tail.getElement();
	}

	// update methods
	public void addFirst(E e) { 
		head = new Node<>(e, head); 
		if (size == 0)
			tail = head;
		size++;
	}
	public void addLast(E e) { 
		Node<E> newest = new Node<>(e, null);
		if (isEmpty()) // false
			head = newest;
		else
			tail.setNext(newest); 
		tail = newest; 
		size++;
	}
	
	public E removeFirst() { 
		if (isEmpty()) 
			return null; 
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null; 
		return answer;
	}
}