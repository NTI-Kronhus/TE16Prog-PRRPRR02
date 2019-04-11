package iterator_pattern.my_iterator;

public interface IIterator<E> {
	
	public boolean hasNext();
	
	public E getNext();

}
