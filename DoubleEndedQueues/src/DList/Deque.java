package DList;

public interface Deque<T> {
	
	public void addFirst(T element);
	
	public void addLast(T element);
	
	public T removeFirst();
	
	public T removeLast();
	
	public T first();
	
	public T last();
	
	public int getSize();
	
	public boolean isEmpty();
	

}
