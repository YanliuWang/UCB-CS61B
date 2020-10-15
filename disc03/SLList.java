public class SLList {
	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int item, IntNode next) {
			this.item = item;
			this.next = next;
		}
	}

	private IntNode first;

	public void addFirst(int x) {
		first = new IntNode(x, first);
	}

	public void insert(int x, int pos) {
		if (first == null || pos == 0) {
			addFirst(x);
		}

		IntNode curr = first;

		while (pos > 0 && curr.next != null) {
			pos--;
			curr = curr.next;
		}

		IntNode newNode = new IntNode(x, curr.next);
		curr.next = newNode;


	}

	public void reverse() {
		if (first == null || first.next == null) {
			return;
		}

		IntNode ptr = first.next;
		first.next = null;

		while (ptr != null) {
			IntNode tmp = ptr.next;
			ptr.next = first;
			first = ptr;
			ptr = tmp;
		}

	}

	public void reverseRecur() {
		reverseHelper(first);
	}

	private IntNode reverseHelper(IntNode first) {
		if (first == null || first.next == null) {
			return first;
		}

		IntNode endOfRebersed = first.next;
		IntNode reversed = reverseHelper(first.next);
		endOfRebersed.next = first;
		first.next = null;

		return reversed;
	}



	public void printLinkedList() {
		IntNode curr = first;

		while (curr != null) {
			System.out.print(curr.item + " ");
			curr = curr.next;
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3};
		arr = SLList.insert(arr, 8, 1);

		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}

	}

	public static int[] insert(int[] arr, int item, int pos) {
		int[] newArr = new int[arr.length + 1];
		
		if (pos >= arr.length) {
			newArr[arr.length] = item;
			
		} else {
			for (int i = 0; i < pos; ++i) {
				newArr[i] = arr[i];
			}

			newArr[pos] = item;

			for (int i = pos; i < arr.length; ++i) {
				newArr[i+1] = arr[i];
			}

		}

		return newArr;

	}


}