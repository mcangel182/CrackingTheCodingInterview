package Question2_1;

import java.util.HashSet;

import DataStructures.LinkedListNode;

public class Question2_1 {

	public static void removeDups(LinkedListNode<Integer> n){
		HashSet<Integer> elems = new HashSet<Integer>();
		LinkedListNode<Integer> prev = null;
		
		while(n != null){
			if (elems.contains(n.object)){
				prev.next = n.next;
			}
			else{
				elems.add(n.object);
				prev = n;
			}
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> first = new LinkedListNode<Integer>(0);
		LinkedListNode<Integer> head = first;
		LinkedListNode<Integer> second = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode<Integer>(i % 2);
			first.next = second;
			first = second;
		}
		System.out.println(head.printForward());
		removeDups(head);
		System.out.println(head.printForward());
	}

}
