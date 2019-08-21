public class SinglyLinkedListTest {

	public static void main(String[] args) {
		addTwoElements();
		addFourElements();
		addFourElementsThenRemoveTwo();
		testGet();
		testRemove();
		addFirstTwoElements();
		testFirstRemove();
		testRemoveLast();
		reverseElements();
	}

	private static void addTwoElements(){
		String a = "abc";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(x);
		System.out.println("addTwoElements: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void reverseElements(){
		String a = "abc";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(x);
		SinglyLinkedList<String> newList = lst.reverse();
		System.out.println("reverseElements: " + newList.toString()+ ",Size: " + lst.size());
	}
	//meine Tests
	private static void addFirstTwoElements(){ //funktioniert!
		String a = "abc";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.addFirst(a);
		lst.addFirst(x);
		System.out.println("addFirstTwoElements: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void testFirstRemove() {
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		lst.removeFirst();
		lst.removeFirst();
		System.out.println("testFirstRemove: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void addFourElements(){
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		System.out.println("addFourElements: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void addFourElementsThenRemoveTwo(){
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		lst.remove(0);
		lst.remove(0);
		System.out.println("addFourElementsThenRemoveTwo: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void testGet() {
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		System.out.println("testGet: " + lst.get(0) + " " + lst.get(2)+ ",Size: " + lst.size());
	}

	private static void testRemove() {
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		lst.remove(2);
		lst.remove(0);
		System.out.println("testRemove: " + lst.toString()+ ",Size: " + lst.size());
	}

	private static void testRemoveLast() { //funktioniert!
		String a = "a";
		String b = "b";
		String c = "c";
		String x = "xyz";
		SinglyLinkedList<String> lst = new SinglyLinkedList<>();
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(x);
		lst.removeLast();
		lst.removeLast();
		System.out.println("testRemoveLast: " + lst.toString()+ ",Size: " + lst.size());
	}
}
