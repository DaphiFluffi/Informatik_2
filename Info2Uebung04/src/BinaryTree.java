public class BinaryTree <E> implements Tree <E> {
	private int key ;
	private E value ;
	private BinaryTree<E> left = null ;
	private BinaryTree<E> right = null ;

	//ZEITKOMPLEXITAET??
	public BinaryTree ( int k, E v){ //Konstruktor
		this . key = k;
		this . value = v;
	}

	//wir messen die height() von der rechten und liken Seite des Baums
	//Sobald beider rekursiven if-Bedingungen fertig sind,
	//wird die größte höhe + 1 (weil root) zusrückgegeben
	public int height () {
		int heightLeft = -1;
		int heightRight = -1;
		if ( left != null ) {
			heightLeft = left . height ();
		}
		if ( right != null ) {
			heightRight = right . height ();
		}
		return Math . max( heightLeft , heightRight ) + 1;
	}
	//selbes Vorgehen wie bei height()
	//man befragt die Kinder der rechen und linken Seite darüber welche größe sie haben
	public int size () {
		int sizeLeft = 0;
		int sizeRight = 0;
		if ( left != null ) {
			sizeLeft = left . size ();
		}
		if ( right != null ) {
			sizeRight = right . size ();
		}
		return sizeLeft + sizeRight + 1; //addieren am ende + 1(wegen root)
	}

	public BinaryTree<E> find (int k) {
		if (key == k) {
			return this ;
		}
		if ( left != null ) {
			BinaryTree<E> leftRes = left . find (k);
			if ( leftRes != null ) {
				return leftRes ;
			}
		}
		if ( right != null ) {
			BinaryTree<E> rightRes = right . find (k);
			if ( rightRes != null ) {
				return rightRes ;
			}
		}
		return null ;
	}
	public int sum(){
		int sum = (int)this.value;
		if(left != null){
			sum = sum + left.sum();
		}
		if(right != null){
			sum = sum + right.sum();
		}
		return sum;
	}
}