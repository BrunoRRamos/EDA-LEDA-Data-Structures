package linkedList;

public class RecursiveSingleLinkedListImpl<T> implements LinkedList<T> {

	protected T data;
	protected RecursiveSingleLinkedListImpl<T> next;

	public RecursiveSingleLinkedListImpl() {}

	@Override
	public boolean isEmpty() {
		return data == null;
	}

	@Override
	public int size() {
		int size = 0;

		if (!isEmpty()) {
			size = next.size();
			size++;
		}
		return size;
	}

	@Override
	public T search(T element) {
		T output = null;

		if (!isEmpty()) {
			if(getData().equals(element)) {
				output = getData();

			} else {
				output = next.search(element);
			}
		}

		return output;
	}

	@Override
	public void insert(T element) {
		if(isEmpty() && element != null) {
			this.setData(element);
			this.setNext(new RecursiveSingleLinkedListImpl<>());

		} else {
			this.next.insert(element);
		}
	}

	@Override
	public void remove(T element) {

		if (getData().equals(element)) {
			this.data = next.data;
			this.next = next.next;
		} else {
			next.remove(element);
		}
	}

	@Override
	public T[] toArray() {
		T[] array = (T[]) new Object[size()];
		toArrayAux(array, 0);
		return array;
	}

	private void toArrayAux(T[] arr, int index) {
		if (!isEmpty()) {
			arr[index] = getData();
			this.next.toArrayAux(arr, index + 1);
		}
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public RecursiveSingleLinkedListImpl<T> getNext() {
		return next;
	}

	public void setNext(RecursiveSingleLinkedListImpl<T> next) {
		this.next = next;
	}

}
