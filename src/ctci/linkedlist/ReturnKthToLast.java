package ctci.linkedlist;

/**
 * Cracking Coding Interview 
 * 
 * 2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list. 
 * 
 * Approach : 1. If linked list size is known 
 * 			  2. Recurse linked list from back 
 * 			  3. Two pointers k distance apart
 * 
 * Assumptions : N/A
 * 
 * @author POOJA
 *
 */


public class ReturnKthToLast {
	
	public static Node<Integer> kthNodeEnd(Node<Integer> head, int k){
		
		Node<Integer> p1 = head;
		Node<Integer> p2 = head;
		
		for(int i=0;i<k;i++){
			if(p1 == null)
				return null;
			p1 = p1.next;
		}
		
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}

	public static void main(String[] args) {
		
		Node<Integer> nodeOne = new Node<Integer>(9);
		Node<Integer> nodeTwo = new Node<Integer>(10,nodeOne);
		Node<Integer> nodeThree = new Node<Integer>(11,nodeTwo);
		Node<Integer> nodeFour = new Node<Integer>(12,nodeThree);
		Node<Integer> nodeFive = new Node<Integer>(13,nodeFour);
		Node<Integer> head = nodeFive;
		
		int k = 4;
		
		head = kthNodeEnd(head, k);
		
		if(head == null){
			System.out.println("Invaild value of K");
		}
		else 
		    System.out.println("For K = " + k + ", Kth Node from the last is : " + head.data);
		
	}

}
