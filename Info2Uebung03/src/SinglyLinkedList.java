import java.util.Stack;

public class SinglyLinkedList<E> {
	private SinglyLinkedNode<E> head = null;
	private int sz = 0;

	public void add(E o) {
		SinglyLinkedNode<E> newNode = new SinglyLinkedNode<>();
		newNode.next = null;
		newNode.value = o;
		if (head == null) {
			head = newNode;
			sz++;
			return;
		}
		SinglyLinkedNode<E> c = head;
		while (c.next != null) {
			c = c.next;
		}
		c.next = newNode;
		sz++; //warum ist das richtig?
	}

	public E get(int i) {
		int c = 0;
		SinglyLinkedNode<E> cursor = head;
		while (c != i) {
			cursor = cursor.next;
			c++;
		}
		return cursor.value;
	}

	public void remove(int i) {
		int c = 0;
		if (i == 0) {
			head = head.next;
			sz--;
			return;
		}
		SinglyLinkedNode<E> node = head;
		while (c < i-1) {
			node = node.next;
			c++;
		}
		node.next = node.next.next;
		sz--;
	}

	/*public int size() {
		int c = 0;
		SinglyLinkedNode<E> node = head;
		while (node != null) {
			c++;
			node = node.next;
		}
		return c;
	}*/
	public int size(){
		return sz; //now we have O(1) not O(n)
	}

	//omg! alle funktionieren!!
	public void addFirst(E obj){
		SinglyLinkedNode <E> newNode = new SinglyLinkedNode<> (); //neue Node erstellen
		newNode.value = obj; //definiere den Value von newNode
		newNode.next = head ; //definiere das Next von newNode
		this.head = newNode; //newNode ist vollständig definiert, this.head muss man eig immer schreiben?
		sz++;
	}

	public void removeFirst(){
		head = head.next;
		sz--;
	}

	public void removeLast(){
		SinglyLinkedNode<E> cursor = head;
		while(cursor.next != null) {
			cursor = cursor.next;
			if (cursor.next.next == null) { //wenn du die vorletze node gefunden hast
				cursor.next = null; //lass die nach ihr auf null zeigen
				sz--;
			}
		}
	}

	public String toString(){
		SinglyLinkedNode <E> cursor = head;
		String finalString = "";
		while(cursor.next != null) {
			finalString = finalString + (String) cursor.value + " ";

			cursor = cursor.next;

		}
		finalString = finalString + (String) cursor.value + " "; //weil das letzte Element gar nicht durchlaufen wird
		return finalString;
	}

	public SinglyLinkedList reverse(){
		SinglyLinkedList<E> newList = new SinglyLinkedList<>();

		SinglyLinkedNode <E> cursor = head;
		while(cursor != null) {
			newList.addFirst(cursor.value);
			cursor = cursor.next;
		}
		return newList;
	}

	public SinglyLinkedList<E> reverse2() {
		Stack<E> stack = new Stack<>();
		SinglyLinkedNode<E> cursor = head;
		while (cursor != null) {
			stack.push(cursor.value);
			cursor = cursor.next;
		}
		SinglyLinkedList<E> res = new SinglyLinkedList<>();
		while (!stack.isEmpty()) { //schlau!!! A4!!!
			res.add(stack.pop());
		}
		return res;
	}

	}