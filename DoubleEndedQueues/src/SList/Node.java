package SList;

public class Node<T> {

	private Node<T> next;
	private T element;
	
	
	public Node(T element, Node<T> next) {
		super();
		this.next = next;
		this.element = element;
	}
	
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	
	

}
