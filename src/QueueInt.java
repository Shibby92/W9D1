//Kreiranje reda	
public class QueueInt {
	Node head;
	Node tail;

	public QueueInt() {
		head = null;
		tail = null;
	}

	/**
	 * Dodaje vrijednosti u red
	 * 
	 * @param value
	 *            Vrijednost koja se dodaje u red
	 */
	public void push(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = tail.next;
	}

	/**
	 * Izbacivanje vrijednosti iz reda
	 * 
	 * @return Vrijednost koja se izbacuje
	 */
	public int pop() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Red je prazan!");
		}
		if (head == tail) {
			int value = head.value;
			Node tmp = head;
			head = head.next;
			tmp.next = null;
			tail = null;
			return value;
		}
		int value = head.value;
		Node tmp = head;
		head = head.next;
		tmp.next = null;
		return value;
	}

	/**
	 * Vraca vrijednost iz reda
	 * 
	 * @return Vrijednost iz reda
	 */
	public int peek() {
		if (head == null) {
			throw new IndexOutOfBoundsException("Red je prazan!");
		}
		return head.value;
	}

	/**
	 * Vraca velicinu reda
	 * 
	 * @return Velicinu reda
	 */
	public int getSize() {
		int counter = 1;
		Node flier = head;
		while (flier != tail) {
			flier = flier.next;
			counter++;
		}
		return counter;

	}

	/**
	 * Provjerava postojanje proslijedjenog sadrzaja u redu
	 * 
	 * @param value
	 *            Vrijednost koja se trazi
	 * @return True/false ovisno od ishoda
	 */
	public boolean contains(int value) {
		if (head == null) {
			throw new IndexOutOfBoundsException("Stack je prazan!");
		}
		Node flier = head;
		while (flier != null) {
			if (flier.value == value) {
				return true;
			}
			flier = flier.next;
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
