package linkedlist;

public class Basicall {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		
		Node a = new Node(2);
		Node b = new Node(6);
		Node c = new Node(8);
		Node d = new Node(15);
		Node e = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		System.out.println(a.next.next.data);
		
	}

}
