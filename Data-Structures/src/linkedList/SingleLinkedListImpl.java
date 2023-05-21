package linkedList;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;

	public SingleLinkedListImpl() {
		this.head = new SingleLinkedListNode<T>();
	}

	@Override
	public boolean isEmpty() {
		return this.head.isNIL();
	}

	@Override
	public int size() {
		SingleLinkedListNode<T> aux = this.head;
		int size = 0;

		if (aux.data != null) {
			while (aux.getData() != null) {
				aux = aux.getNext();
				size++;
			}
		}
		return size;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> auxHead = head;

		while (!auxHead.isNIL() && auxHead.getData() != element) {
			auxHead = auxHead.getNext();
		}
		if (auxHead.getData() == element) {
			return auxHead.getData();
		}

		return null;
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> auxHead = this.head;

		if (this.head.data == null && element != null) {
			this.head.setData(element);
			this.head.setNext(new SingleLinkedListNode<>());
		} else {
			while (auxHead.data != null) {
				auxHead = auxHead.next;
			}
			auxHead.data = element;
			auxHead.next = new SingleLinkedListNode<T>();
		}
	}

	public void insertFirst(T element) {
		SingleLinkedListNode newNode = new SingleLinkedListNode();
		SingleLinkedListNode aux = this.head;

		if (this.head.getData() == null && element != null) {
			this.head.setData(element);
			this.head.setNext(new SingleLinkedListNode<>());

		} else if (element != null) {
			newNode.setData(element);
			newNode.setNext(aux);
			this.head = newNode;
		}
	}

	@Override
	public void remove(T element) {

		if (head.data.equals(element)) {
			head = head.next;
		} else {
			SingleLinkedListNode<T> auxHead = head;

			while (!auxHead.isNIL() && !auxHead.data.equals(element)) {
				auxHead = auxHead.next;
			}
			if (!auxHead.isNIL()) {
				auxHead.data = auxHead.next.data;
				auxHead.next = auxHead.next.next;
			}
		}
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[size()];
		SingleLinkedListNode<T> auxHead = this.head;
		int arrayIndex = 0;

		if (auxHead.isNIL()) {
			return array;
		}

		while (!auxHead.isNIL()) {
			array[arrayIndex] = auxHead.getData();
			arrayIndex++;
			auxHead = auxHead.next;
		}

		return array;
	}

	public SingleLinkedListNode<T> getHead() {
		return head;
	}

	public void setHead(SingleLinkedListNode<T> head) {
		this.head = head;
	}

}
