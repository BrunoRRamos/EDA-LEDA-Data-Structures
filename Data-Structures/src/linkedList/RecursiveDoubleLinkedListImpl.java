package linkedList;

public class RecursiveDoubleLinkedListImpl<T> extends
		RecursiveSingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected RecursiveDoubleLinkedListImpl<T> previous;

	public RecursiveDoubleLinkedListImpl() {

	}

	@Override
	public void insert(T element) {
		if (element != null) {
			if(isEmpty()) {
				this.setData(element);
				this.setNext(new RecursiveDoubleLinkedListImpl<>());
				this.setPrevious(this.previous);

			} else {
				this.next.insert(element);
			}
		}
	}

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			if (this.isEmpty()) {
				this.setData(element);
				this.setPrevious(new RecursiveDoubleLinkedListImpl<>());
				this.setNext(new RecursiveDoubleLinkedListImpl<>());
			} else {
				RecursiveDoubleLinkedListImpl<T> newNode = new RecursiveDoubleLinkedListImpl<>();
				newNode.setData(this.getData());
				newNode.setNext(this.getNext());
				newNode.setPrevious(this);
				this.setData(element);
				this.setNext(newNode);
			}
		}
	}

	@Override
	public void removeFirst() {
		if (!this.isEmpty()) {
			this.data = this.next.data;
			this.next = this.next.next;
		}
	}

	@Override
	public void removeLast() {
		if (this.next.isEmpty()) {
			this.data = null;
			this.next = null;
		} else {
			((RecursiveDoubleLinkedListImpl<T>) this.next).removeLast();
		}

	}

	public RecursiveDoubleLinkedListImpl<T> getPrevious() {
		return previous;
	}

	public void setPrevious(RecursiveDoubleLinkedListImpl<T> previous) {
		this.previous = previous;
	}

}
