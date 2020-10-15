/**
 * @author yanliu
 * @create 2020-10-15-16:33
 */
public class ArrayDeque<T> implements Deque<T>{
    private T[] elements;
    private final int MIN_INITIAL_CAPACITY = 8;
    private int size;


    public ArrayDeque() {
        size = MIN_INITIAL_CAPACITY;
        elements = (T[]) new Object[size];
    }

    public ArrayDeque(ArrayDeque other) {
        size = other.elements.length;
        elements = (T[]) new Object[size];

        for (int i = 0; i < size; ++i) {
            this.elements[i] = (T) other.elements[i];
        }


    }


    /**
     * Adds an item of type T to the front of the deque.
     *
     * @param item
     */
    @Override
    public void addFirst(T item) {

    }

    /**
     * Adds an item of type T to the back of the deque.
     *
     * @param item
     */
    @Override
    public void addLast(T item) {

    }

    /**
     * Returns true if deque is empty, false otherwise.
     *
     * @return true if deque is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Returns the number of items in the deque.
     *
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Prints the items in the deque from first to last,
     * separated by a space. Once all the items have been printed, print out a new line.
     */
    @Override
    public void printDeque() {

    }

    /**
     * Removes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     *
     * @return the item at the front of the deque
     */
    @Override
    public T removeFirst() {
        return null;
    }

    /**
     * Removes and returns the item at the back of the deque.
     * If no such item exists, returns null.
     *
     * @return the item at the back of the deque
     */
    @Override
    public T removeLast() {
        return null;
    }

    /**
     * Gets the item at the given index, where 0 is the front,
     * 1 is the next item, and so forth. If no such item exists,
     * returns null. Must not alter the deque!
     *
     * @param index
     * @return item at index
     */
    @Override
    public T get(int index) {
        return null;
    }
}
