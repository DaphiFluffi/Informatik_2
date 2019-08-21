// we intentionally don 't make this class public ,
// however , it is important for it to be in the
// same package as SinglyLinkedList
public class SinglyLinkedNode <E> {
	E value = null ; //E ist der Datentyp von value
	//E kann alles sein solange E ein Referenzdatentyp ist !
 	SinglyLinkedNode<E> next = null ;
}