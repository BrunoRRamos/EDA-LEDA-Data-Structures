package linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
		DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	public DoubleLinkedListImpl() {
		this.head = new DoubleLinkedListNode<T>();
		this.last = (DoubleLinkedListNode<T>) head;
	}

	@Override
	public void insert(T element) {
		if (isEmpty()) {
			this.setHead(new DoubleLinkedListNode<T>(element, this.last, (DoubleLinkedListNode<T>) this.head));
			setLast((DoubleLinkedListNode<T>) this.head);
		} else {
			DoubleLinkedListNode<T> newElement = new DoubleLinkedListNode<T>(element, new DoubleLinkedListNode<>(), this.last);
			this.last.setNext(newElement);
			this.setLast(newElement);
		}
	}

	@Override
	public void insertFirst(T element) {
		if (isEmpty()) {
			insert(element);
		} else {
			DoubleLinkedListNode<T> newHead = new DoubleLinkedListNode<T>(element, (DoubleLinkedListNode<T>) getHead(),
					new DoubleLinkedListNode<T>());
			setHead(newHead);
		}
	}

	@Override
	public void removeFirst() {
		if (!this.head.isNIL()) {
			this.head = this.head.next;
			if (this.head.isNIL()) {
				this.last = (DoubleLinkedListNode<T>) this.head;
			}
		}
	}

	@Override
	public void removeLast() {
		if (!isEmpty()) {
			this.setLast(this.getLast().getPrevious());
			this.getLast().setNext(new DoubleLinkedListNode<T>());
		}
	}

	public DoubleLinkedListNode<T> getLast() {
		return last;
	}

	public void setLast(DoubleLinkedListNode<T> last) {
		this.last = last;
	}

}
