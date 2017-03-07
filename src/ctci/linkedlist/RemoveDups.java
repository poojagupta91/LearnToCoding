package ctci.linkedlist;

import java.util.HashSet;

/**
 * Cracking Coding Interview 
 * 
 * 2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list. 
 *                  How would you solve this problem if a temporary buffer is not allowed?   
 * 
 * Approach : 1. Hash Table to keep track of elements 
 * 			  2. Two pointers to iterate through linked list 
 * 
 * Assumptions : N/A
 * 
 * @author POOJA
 *
 */

public class RemoveDups {

	public static void deleteDupsHashSet(Node<Integer> head){
		
		HashSet<Integer> set = new HashSet<Integer>();
		Node<Integer> prev = null;
		
		if(head == null || head.next == null)
			return ;
		
		while(head != null){
			if(set.contains(head.data)){
				prev.next = head.next;
			}
			else {
			set.add(head.data);
			prev = head;
		   }
		head = head.next;
		}
	}
	
	public static void deleteDupsNoBuffer(Node<Integer> head){
		Node<Integer> current = head;
		Node<Integer> nextnode = null;
		
		while(current != null){
			nextnode = current;
			while(nextnode.next != null){
			 if(current.data == nextnode.next.data){
				nextnode.next = nextnode.next.next;
			 }
			 else
			  nextnode = nextnode.next;
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		
		Node<Integer> nodeOne = new Node<Integer>(11);
		Node<Integer> nodeTwo = new Node<Integer>(10,nodeOne);
		Node<Integer> nodeThree = new Node<Integer>(12,nodeTwo);
		Node<Integer> nodeFour = new Node<Integer>(11,nodeThree);
		Node<Integer> nodeFive = new Node<Integer>(13,nodeFour);
		Node<Integer> head = nodeFive;
		Node<Integer> ptr = nodeFive;
		
		//deleteDupsHashSet(head);
		deleteDupsNoBuffer(head);
		
		while(ptr != null){
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}

	}
	

}
