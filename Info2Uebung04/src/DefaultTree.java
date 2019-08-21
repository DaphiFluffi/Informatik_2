import java.util.LinkedList;
import java.util.List;

public class DefaultTree <E> implements Tree <E>{
	private int key ;
	private E value ;

	private List <DefaultTree<E>> children ;

	public DefaultTree ( int k, E v) { //Konstruktor
		this.key = k;
		this.value = v; //bis hier genauso wie in BinaryTree
		this.children = new LinkedList <>();
	}

	public E getValue () {
		return value ;
	}

	public List <DefaultTree<E>> getChildren () {
		return children ;
	}
	public void addChild ( DefaultTree<E> child ) {
		children .add( child );
	}

	public int height () {
		// first , get the maximum height of all children
		int result = -1;
		for ( DefaultTree<E> child : children ) {
			int h = child.height(); //rekursiv
			if ( result < h) { //Maximumsfunktion
				result = h;
			}
		}
		// height of a node is maximum height children + 1
		return result + 1;
		}

	public int size () {
		// the size of this thee is the sum of the sizes
		// of the children plus 1
		int sum = 0;
		for ( DefaultTree<E> child : children ) {
			sum = sum + child . size (); //Typisches Summe bestimmen
		}
		return sum + 1;
	}

	public DefaultTree<E> find (int k) {
		if (key == k) {
			return this ;
		}
		for ( DefaultTree<E> child : children ) {
			DefaultTree<E> tree = child . find (k);
			if ( tree != null ) {
				return tree ;
			}
		}
		return null ;
	}
}
