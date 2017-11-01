package Question2_2;

import DataStructures.LinkedListNode;
import Helpers.HelperMethods;

public class Question2_2 {

	public static  LinkedListNode<Integer> nthToLast(LinkedListNode<Integer> head, int n){
		LinkedListNode<Integer> runner = head;
		int i;
		for (i = 1; i < n && runner != null; i++){
			runner = runner.next;
		}
		if (i == n){
			LinkedListNode<Integer> current = head;
			while(runner.next != null){
				runner = runner.next;
				current = current.next;
			}
			return current;
		}
		return null;
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = HelperMethods.randomLinkedList(10, 0, 15);
		System.out.println(head.printForward());
		int nth = 3;
		LinkedListNode<Integer> n = nthToLast(head, nth);
		if (n != null) {
			System.out.println(nth + "th to last node is " + n.object);
		} else {
			System.out.println("Null.  n is out of bounds.");
		}
	}
	
}
