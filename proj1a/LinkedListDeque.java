/**
 * @author yanliu
 * @create 2020-10-15-16:33
 */
public class LinkedListDeque<T> implements Deque<T>{
    private int size;
    private Node sentinel;

    public class Node {
        private Node prev;
        private T elem;
        private Node next;

        public Node(T elem, Node prev, Node next) {
            this.elem = elem;
            this.prev = prev;
            this.next = next;
        }
    }

    public LinkedListDeque() {
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;

        size = 0;
    }

    public LinkedListDeque(LinkedListDeque other) {
        // Creating a deep copy means that you create an entirely new LinkedListDeque,
        // with the exact same items as other. However, they should be different objects,

        LinkedListDeque listDeque = new LinkedListDeque();
        listDeque.size = other.size;

        for (int i = 0; i < size; ++i) {
            listDeque.addLast(other.get(i));
        }

    }

    /**
     * Adds an item of type T to the front of the deque.
     *
     * @param elem
     */
    @Override
    public void addFirst(T elem) {
        Node newNode = new Node(elem, sentinel, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;

        size++;

    }

    /**
     * Adds an item of type T to the back of the deque.
     *
     * @param elem
     */
    @Override
    public void addLast(T elem) {
        Node newNode = new Node(elem, sentinel.prev, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;

        size++;
    }

    /**
     * Returns true if deque is empty, false otherwise.
     *
     * @return true if deque is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return sentinel.next == sentinel;
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
        Node curr = sentinel;

        while (curr.next != sentinel){
            curr = curr.next;
            System.out.print(curr.elem + " ");
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
        Node delNode = sentinel.next;
        T elem = delNode.elem;

        if (elem == null) {
            return null;
        }

        Node curr = sentinel;
        curr.next = curr.next.next;
        curr.next.prev = curr;

        delNode.next = null;
        delNode.prev = null;

        size--;

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
        Node delNode = sentinel.prev;
        T elem = delNode.elem;

        if (elem == null) {
            return null;
        }

        Node curr = sentinel;
        curr.prev = curr.prev.prev;
        curr.prev.next = curr;

        delNode.prev = null;
        delNode.next = null;

        size--;

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
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }

        Node curr = sentinel;

        do {
            curr = curr.next;
        } while (index-- > 0);

        return curr.elem;
    }

}
