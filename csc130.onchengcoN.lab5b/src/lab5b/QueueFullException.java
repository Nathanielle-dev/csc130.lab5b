package lab5b;

/**
 * Title: The QueueFullException
 * Description: Throws an exception when queue is full
 * @author ChengC, YanezM, OnchengcoN
 */

public class QueueFullException extends RuntimeException {
	
	public QueueFullException() {
		super("Queue Full Exception");
	}
	
	public QueueFullException(String msg) {
		super(msg);
	}

}
