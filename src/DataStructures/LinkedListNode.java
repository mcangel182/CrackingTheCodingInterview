package DataStructures;

public class LinkedListNode<T> {

    public LinkedListNode<T> next;

    public T object;
  
    public LinkedListNode(T x){
        object = x;
        next = null;
    }
    
    public String printForward() {
		if (next != null) {
			return object + "->" + next.printForward();
		} else {
			return object.toString();
		}
	}
}
