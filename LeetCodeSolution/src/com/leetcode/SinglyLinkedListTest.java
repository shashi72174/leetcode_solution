package com.leetcode;


class ListNode<E> {
	E data;
	ListNode<E> next;
	
	public ListNode() {
		
	}
	
	public ListNode(E data, ListNode<E> next) {
		this.data=data;
		this.next=next;
	}
}


public class SinglyLinkedListTest<E> {
	
	private ListNode<E> header = null;
	
	public SinglyLinkedListTest() {

	}
	
	public void add(E data) {
		if(header==null)
			header = new ListNode<E>(data,null);
		else {
			ListNode<E> temp = header;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new ListNode<E>(data,null);
		}
	}
	
	public void reverseDisplay() {
		ListNode<E> current = header;
		ListNode<E> prevNode = null;
		ListNode<E> next = null;
		while(current!=null) {
			next = current.next;
			current.next=prevNode;
			prevNode=current;
			current = next;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		SinglyLinkedListTest<Integer> singlyLinkedListTest = new SinglyLinkedListTest<Integer>();
		singlyLinkedListTest.add(10);
		singlyLinkedListTest.add(20);
		singlyLinkedListTest.add(30);
		singlyLinkedListTest.reverseDisplay();
	}

}
