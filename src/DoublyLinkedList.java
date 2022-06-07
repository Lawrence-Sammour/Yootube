public class DoublyLinkedList {

	public Node header;

	public Node trailer;

	int size;

	String nameOfList;

	DoublyLinkedList(String nameOfList) {

		this.nameOfList = nameOfList;

		header = new Node();

		trailer = new Node();

		header.next = trailer;

		trailer.prev = header;

	}

	public void addFirst(Node n) {

		Node pointer = header.next;

		n.next = header.next;
		header.next = n;
		pointer.prev = n;
		n.prev = header;

		++size;

	}

	public void removeNodeAccordingToPosition(int position) throws NullPointerException, IndexOutOfBoundsException {

		Node pointer = header;

		Node pointer2;

		if (header.next == trailer)
			throw new NullPointerException("This List doesn't have any videos");

		else if (position < 1 || position > size)
			throw new IndexOutOfBoundsException("Please enter a valid positoin in the list");

		else {

			for (int j = 1; j < position; j++)

				pointer = pointer.next;

			pointer2 = pointer.next.next;

			pointer.next = pointer2;

			pointer2.prev = pointer;

			--size;

		}

	}

	public void printList() {

		// nodes' positions
		int position = 1;

		Node pointer = header.next;

		if (header.next == trailer && trailer.prev == header)
			System.out.println("This list can't be printed because it's empty");

		else {
			while (pointer != trailer) {

				System.out.println(position + "." + pointer.title + " (" + pointer.ID + ")");

				pointer = pointer.next;

				System.out.println();

				++position;

			}

		}

	}

	public void watchVideoAccordingToPosition(int position)
			throws InterruptedException, NullPointerException, IndexOutOfBoundsException {

		Node pointer = header.next;

		if (header.next == trailer && trailer.prev == header)
			throw new NullPointerException("This list is empty!!!");

		else if (position < 1 || position > size)
			throw new IndexOutOfBoundsException("Please enter a valid positoin in the list");

		else {

			for (int j = 1; pointer != trailer && j < position; j++) {

				pointer = pointer.next;

			}

			// node is previewed "video is watched"
			++pointer.hits;

			System.out.println("Running " + pointer.title);

			Thread.sleep(6000);

		}

	}

	// to get information for a specific node
	public void getInformationOfAVideoAccordingToPosition(int position)
			throws NullPointerException, IndexOutOfBoundsException {

		Node pointer = header;

		if (header.next == trailer && trailer.prev == header)
			throw new NullPointerException("This List is empty!!!");

		else if (position < 1 || position > size)
			throw new IndexOutOfBoundsException("Please enter a valid positoin in the list");

		else {
			for (int i = 0; i < position; ++i) {

				pointer = pointer.next;

			}

		}

		System.out.println("\nVideo title is " + pointer.title + " published by the user " + pointer.user
				+ " under the " + pointer.category + " category. " + "The Videos ID is " + pointer.ID
				+ "\nand the URL of it is " + pointer.URL + " with a size " + pointer.sizeMega
				+ "The video was watched " + pointer.hits);

	}

	// searching for a node according to position
	public Node searchForNode(int position) throws NullPointerException {

		Node pointer = header.next;

		if (header.next == trailer && trailer.prev == header)
			System.out.println("This list is empty");

		for (int i = 1; i < position; ++i) {

			pointer = pointer.next;

		}

		return pointer;

	}

	public void addNodeAccordingToPosition(Node n, int i) {

		Node pointer = header;

		for (int c = 1; pointer != trailer && c < i; ++c)
			pointer = pointer.next;

		n.next = pointer.next;

		pointer.next = n;

		n.prev = pointer;

		n.next.prev = n;

		++size;

	}

	// moving node from one position to another.
	public void moveNodeInList(int position1, int position2) {

		// pointing to original node value
		Node n = searchForNode(position1);

		// remove node from old position
		this.removeNodeAccordingToPosition(position1);

		// add node in new position
		this.addNodeAccordingToPosition(n, position2);

	}

	public void playInOrder() throws InterruptedException {

		for (int i = 1; i < size; ++i) {

			this.watchVideoAccordingToPosition(i);

		}

	}

	// displaying nodes from random positions
	public void shuffleList(int time) throws InterruptedException {

		// converting to minutes and determining loop iterations (/6)
		time = (60 * time) / 6;

		for (int i = 0; i < time; ++i) {

			int random = (int) (Math.random() * size) + 1;

			this.watchVideoAccordingToPosition(random);

			++this.searchForNode(random).hits;

		}

	}

	// for clearing history list.
	public void returningNumberOfHitsToZero() {

		Node pointer = header;

		for (int i = 1; i <= size; i++) {

			pointer = pointer.next;

			pointer.hits = 0;

		}

	}

}
