
import java.util.LinkedList; //ich kann hiermit nicht arbiten
import java.util.List;

/**
 * A simplified implementation of HashSet
 * @author gefei
 */

public class SeparateChainingHashSet<E> {
	private int currentSize = 0;

	private int m = 11;

	private LinkedList<E>[] data;

	public SeparateChainingHashSet() { //KOnstruktor!!! (parameterlos)
		data = new LinkedList[m]; //Array der länge m
		for (int i = 0; i < m; i++) {
			data[i] = new LinkedList<>(); //jeder Eintrag in data ist eine LinkedLIst
		}
	}

	/**
	 * @return true if <code>e</code> added to <code>data</code>.
	 *         false if <code>e</code> already existing in <code>data</code>
	 */
	public boolean add(E e) {
		int index = (e.hashCode() & 0x7fffffff) % m; //decodierter hashcode um den index im HashSet zu finden
		List<E> existing = data[index]; //wir sind an einer Stelle im Array, wo eine LinkedList existiert
		for( E ext: existing){
			if(ext.equals(e)){ //wenn irgendwas in dieser LInkedLIst unserem Element e entspricht, dann brauchen wir es nicht hinzufügen
				return false;
			}
		}// jetzt wo wir alle Elemente der Liste geprüft haben, wissen wir, dass e nicht doppelt vorkommen kann
		existing.add(e); //wir fügen das element also hinten in die LIste ein
		return true; //und geben true zurück
	}

	/**
	 * @return true if <code>e</code> removed from <code>data</code>.
	 *         false if <code>e</code> not found in <code>data</code>
	 */
	public boolean remove(Object o) { //geht es auch so?
		int index = (o.hashCode() & 0x7fffffff) % m;
		// your code goes here
		List <E> existing = data[index];
		for(Object obj : existing){
			if(obj.equals(o)){
				existing.remove(o);
				return true;
			}
		}
		return false;
	}

	public boolean contains(Object o) {
		int index = (o.hashCode() & 0x7fffffff) % m;
		// your code goes here
		List<E> existing = data[index];
		if(existing.isEmpty()){
			return false;
		}
		return existing.contains(o);
	}

	public int size() {
		// your code goes here
		int c = 0;
		for(List <E> lst : data){ // wir nehmen eine Instanz von dem Interface Liste
			// und iterieren damit über die Listen in data ohne den Inhalt selbst genauer zu betrachten
			if(lst.isEmpty() != true){ //wenn eine der Listen in data nicht Empty ist, dann existiert sie also c++
				c++;
			} // sonst iteriert die schleife einfach weiter
		}
		return c;
	}

	public static void main(String[] args) {
		SeparateChainingHashSet<String> banana= new SeparateChainingHashSet<>();
		System.out.println("currentSize: " +banana.currentSize); //0
		System.out.println("m: " + banana.m);//11
		System.out.println(banana.add("Banana"));//true
		banana.add("Bitte");
		banana.add("Hallo");
		banana.add("textmarker");
		System.out.println(banana.add("Banana"));//false
		System.out.println(banana.remove("Hallo"));//true
		System.out.println(banana.remove("Hallo"));//false
		System.out.println("size" +banana.size()); //3
		System.out.println("contains" +banana.contains("Bitte"));//true
		System.out.println("contans2" +banana.contains("Hello"));//false
	}
}