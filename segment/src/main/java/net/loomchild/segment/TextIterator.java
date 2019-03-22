package net.loomchild.segment;

import java.util.Iterator;

/**
 * Text iterator interface.
 * 
 * @author loomchild
 */
public interface TextIterator extends Iterator<String> {

	/**
	 * @return next segment in text, or null if end of text has been
	 *         reached.
	 */
	String next();

	/**
	 * @return true if there are more segments
	 */
	boolean hasNext();

	/**
	 * Unsupported operation.
	 * 
	 * @throws UnsupportedOperationException
	 */
	@Override
	void remove();
}
