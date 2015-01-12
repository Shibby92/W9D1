//Kreiranje stacka
public class StackInt {
	Node head;
	private int size;

	public StackInt() {
		this.size = 0;
	}

	/**
	 * Dodavanje vrijednosti na stack
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje
	 */
	public void push(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head = newNode;
		size++;
	}

	/**
	 * Izbacuje i vraca vrijednost vrha stacka
	 * 
	 * @return Vrijednost sa vrha stacka
	 */
	public int pop() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Stack je prazan!");
		}
		// if (head.next == null) {
		// head = null;
		// size--;
		// return 0;
		// }
		int value = head.value;
		head = head.next;
		size--;
		return value;
	}

	/**
	 * Vraca vrijednost sa vrha stacka
	 * 
	 * @return Vrijednost sa vrha stacka
	 */
	public int peek() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Stack je prazan!");
		}
		return head.value;
	}

	/**
	 * Vraca velicinu stacka
	 * 
	 * @return Velicina stacka
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Provjerava da li stack sadrzi neku vrijednost
	 * 
	 * @param value
	 *            Vrijednost koja se provjerava
	 * @return True/false u zavisnosti od ishoda
	 */
	public boolean contains(int value) {
		if (head == null) {
			throw new IndexOutOfBoundsException("Stack je prazan!");
		}
		Node find = head;
		while (find != null) {
			if (find.value == value) {
				return true;
			}
			find = find.next;
		}
		return false;
	}

	class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;

		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}
}
