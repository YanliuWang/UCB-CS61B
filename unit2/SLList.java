public class SLList {
	private static class IntNode {
		private int item;
		private IntNode next;
		private int size;

		public IntNode(int item, IntNode next) {
			this.item = item;
			this.next = next;
		} 
	}

	private IntNode sentinel = new IntNode(0, null);

	public SLList(int item) {
		sentinel.next = new IntNode(item, null);
		size = 1;
	}

	public void addFirst(int item) {
		sentinel.next = new IntNode(item, sentinel.next);
		size++;
	}

	public int getFirst() {
		return first.item;
	}

	public int size() {
		return size; //cache the size
	}

	public void addLast(int item) {
		IntNode curr = sentinel;

		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = new IntNode(item, null);
	}

	// private int size(IntNode p) {
	// 	if (p == null) {
	// 		return 0;
	// 	} else {
	// 		return size(p.next) + 1;
	// 	}
	// }




}