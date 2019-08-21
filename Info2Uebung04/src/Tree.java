public interface Tree <E> {
// all methods in an interface// are public per default
	int height();
	int size();
	Tree <E> find(int k);
}