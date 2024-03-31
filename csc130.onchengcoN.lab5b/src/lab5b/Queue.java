package lab5b;

import lab5b.QueueFullException;
import lab5b.QueueEmptyException;

public interface Queue<T> {
	void enqueue(T d) throws QueueFullException;
	T dequeue() throws QueueEmptyException;
	T front() throws QueueEmptyException;
	boolean isEmpty();
	boolean isFull();
	int getSize();
	

}
