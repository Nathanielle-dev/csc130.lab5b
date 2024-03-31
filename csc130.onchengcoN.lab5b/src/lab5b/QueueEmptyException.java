package lab5b;

/**
 * Title: The QueueEmptyException 
 * Description: Throws an exception when queue is empty
 * @author ChengC, YanezM, OnchengcoN
 */

public class QueueEmptyException extends RuntimeException {

	public QueueEmptyException() {
		super("Queue Empty Exception");
	}

	public QueueEmptyException(String msg) {
		super(msg);
	}

}
