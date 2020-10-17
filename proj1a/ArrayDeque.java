/**
 * @author yanliu
 * @create 2020-10-15-16:33
 */
public class ArrayDeque<T> implements Deque<T>{
    private T[] elements;
    private int front;
    private int back;
    private final int MIN_INITIAL_CAPACITY = 8;
    private int size;
    private final int REFACTOR = 2; // resizing factor


    public ArrayDeque() {
        size = 0;
        front = 0;
        back = MIN_INITIAL_CAPACITY - 1;
        elements = (T[]) new Object[MIN_INITIAL_CAPACITY];
    }

    public ArrayDeque(ArrayDeque other) {
        elements = (T[]) new Object[size];
        front = other.front;
        back = other.back;
        size = other.elements.length;

        for (int i = 0; i < size; ++i) {
            this.elements[i] = (T) other.elements[i];
        }
    }

    private void resizing(int length) {
        elements = (T[]) new Object[length];

    }


    /**
     * Adds an item of type T to the front of the deque.
     *
     * @param item
     */
    @Override
    public void addFirst(Object item) {
        front = (front + 1 + elements.length) % elements.length;
        elements[front] = (T) item;

        size++;

        if (size == elements.length) {
            resizing(size * REFACTOR);
        }
    }

    /**
     * Adds an item of type T to the back of the deque.
     *
     * @param item
     */
    @Override
    public void addLast(T item) {
        back = (back - 1 + elements.length) % elements.length;
        elements[back] = (T) item;

        size++;

        if (size == elements.length) {
            resizing(size * REFACTOR);
        }

    }

    /**
     * Returns true if deque is empty, false otherwise.
     *
     * @return true if deque is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of items in the deque.
     *
     * @return the number of items in the deque.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Prints the items in the deque from first to last,
     * separated by a space. Once all the items have been printed, print out a new line.
     */
    @Override
    public void printDeque() {
        for (int i = front; i < back; ++i) {
            System.out.print(elements[i] + " ");
        }

        System.out.println();

    }

    /**
     * Removes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     *
     * @return the item at the front of the deque
     */
    @Override
    public T removeFirst() {
        T elem = elements[front];

        front = (front + 1 + elements.length) % elements.length;

        return elem;
    }

    /**
     * Removes and returns the item at the back of the deque.
     * If no such item exists, returns null.
     *
     * @return the item at the back of the deque
     */
    @Override
    public T removeLast() {
        T elem = elements[back];

        back = (back - 1 + elements.length) % elements.length;

        return elem;
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
        if (index < 0 || index >= size || isEmpty()) {
            return null;
        }

        return elements[index];

    }
}
