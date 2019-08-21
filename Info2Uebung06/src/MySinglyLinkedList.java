// this class needs to be public
public class MySinglyLinkedList <E>{
	private SinglyLinkedNode <E> head = null ;

	public void addFirst (E obj) {
		SinglyLinkedNode <E> n = new SinglyLinkedNode <>();
		n.value = obj;
		n.next = head ;
		this.head = n;
	}

	public boolean isEmpty(){
		if(size()== 0){
			return true;
		}
		return false;
	}

	// add an element at the end of the list
	public void add(E obj) {
		SinglyLinkedNode <E> n = new SinglyLinkedNode < >();
		n.value = obj;
		n.next = null ;
		if ( head == null ) {
			// if list is empty , we need to set
			// " head " to the new node
			head = n;
			return;
		}
		SinglyLinkedNode <E> cursor = head ;
		while ( cursor.next != null ) {
			cursor = cursor.next ;
		}
		// after the iteration , cursor points to the
		// last element before extending
		cursor.next = n;
		}

	public int size () {
		int s = 0;
		SinglyLinkedNode <E> cursor = head ;
		while ( cursor . next != null ) {
			cursor = cursor . next ;
			s++;
		}
		return s;
	}

	public E get (int i) {
		int c = 0;
		SinglyLinkedNode <E> cursor = head ;
		while (c < i) {
			cursor = cursor . next ;
			c++;
		}
		return cursor . value ;
	}

	public void remove ( int i) {
		int c = 0;
		if (i == 0) {
			head = head . next ;
			return ;
		}
		SinglyLinkedNode <E> cursor = head ;
		while (c < i -1) {
			cursor = cursor . next ;
			c++;
		}
		cursor . next = cursor . next . next ;
	}
	public boolean contains ( Object obj) {
		SinglyLinkedNode cursor = head ;
		while ( cursor != null ) {
			// since we are checking the equality of
			// objects we need to use " equals "
			// rather than "=="
			if ( cursor . value . equals ( obj)) {
				return true ;
			}
			cursor = cursor . next ;
		}
		return false ;
	}
}