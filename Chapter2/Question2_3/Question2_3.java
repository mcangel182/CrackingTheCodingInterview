package Question2_3;

import DataStructures.LinkedListNode;
import Helpers.HelperMethods;

public class Question2_3 {

	public static void deleteMiddleNode(LinkedListNode<Integer> n){
		n.object = n.next.object;
		n.next = n.next.next;
	}
	public static void main(String[] args) {
		LinkedListNode<Integer> head = HelperMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		deleteMiddleNode(head.next.next.next.next); // delete node 4
		System.out.println(head.printForward());
	}

}
