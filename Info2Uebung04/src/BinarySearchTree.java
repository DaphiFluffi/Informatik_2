public class BinarySearchTree <E>  {
	private int key ;
	private E value ;
	private BinarySearchTree <E> left ;
	private BinarySearchTree <E> right ;

	public BinarySearchTree(int k, E obj){
		this.key = k;
		this.value = obj;
	}
	// other methods ingored
	public BinarySearchTree <E> find ( int k) {
		if (k == this . key) {
			return this ;
		} else if (k < this .key) {
			if ( this . left == null ) {
				return null ;
			}
		return this.left.find(k);
		} else {
		// we know k > this . key
			if ( this . right == null ) {
				return null ;
			}
		return this.right.find(k);
		}
	}
	public void add( int k, E obj) {
		BinarySearchTree <E> newTree = new BinarySearchTree <>(k, obj );
		if (k == this . key) {
			// duplicate key. nothing to do. recall in this
			// course , we don 't allow duplicate keys in BSTs
			return ;
		} else if (k < this .key) {
			if ( left == null ) {
				left = newTree ;
			} else {
				left . add(k, obj); //rekursiver Auruf der eigenen add-Methode
			}
		} else {
			if ( right == null ) {
				right = newTree ;
			} else {
				right . add(k, obj);
			}
		}
	}
	public BinarySearchTree<E> minKey(){
		BinarySearchTree<E> x = this;//Ich fange bei mir selbst an
		while(x.left != null){
			x = x.left; //wir gehen die linke Sub-Tree druch bis es nicht mehr geht
		}
		return x;//nach wer while-Schleife sind wir am Ende angekommen also geben wir x einfach zurück
	}

	public BinarySearchTree<E> maxKey(){
		BinarySearchTree<E> maxTree = this;
		while(right != null){
			maxTree = maxTree.right;
		}
		return maxTree;
	}

	public int sum(){ //funktioniert nicht so gut!!
		int sum = (int) this.value;
		if(left != null){
			sum = sum + left.sum();
		}
		if(right != null){
			sum = sum + right.sum();
		}
		return sum;
	}
	public static void main(String[] args) {
		BinarySearchTree<Integer> testTree = new BinarySearchTree<>(15,9);
		testTree.add(1,2);
		testTree.add(2,5);
		testTree.add(4, 9) ;
		testTree.add(3, 20);

		System.out.println("Min " +testTree.minKey().key); //WICHTIG: key ausgeben!
		System.out.println("Max " +testTree.maxKey().key);
		System.out.println("Sum:" + testTree.sum());

	}
}