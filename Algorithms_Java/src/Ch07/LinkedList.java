package Ch07;

import java.util.Comparator;

public class LinkedList<E> {
	
	class Node<E> {
		private E data;
		private Node<E> next;
		
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head;
	private Node<E> curr;
	
	public LinkedList() {
		head = curr = null;
	}
	
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;
		
		while(ptr != null) {
			if(c.compare(obj, ptr.data) == 0) {
				curr = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
	}
	
	public void addFirst(E obj) {
		Node<E> ptr = head;
		head = curr = new Node<E>(obj, ptr);
	}
	
	public void addLast(E obj) {
		if(head == null)
			addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = curr = new Node<E>(obj, null);
		}
	}
	
	public void removeFirst() {
		if(head != null)
			head = curr = head.next;
	}
	
	public void removeLast() {
		if(head != null) {
			if(head.next != null)
				removeFirst();
			else {
				Node<E> ptr = head;
				Node<E> pre = head;
				
				while(ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				
				pre.next = null;
				curr = pre;
			}
		}
	}
	
	public void remove(Node p) {
		if(head != null) {
			if(p == head)
				removeFirst();
			else {
				Node<E> ptr = head;
				
				while(ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) return;	//if reached to end, ends
				}
				
				ptr.next = p.next;
				curr = ptr;
			}
		}
	}
	
	public void removeCurrentNode() {
		remove(curr);
	}
	
	public static void main(String[] args) {
		
	}
}
