package myLinkedList;

public class LLinkedList {
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		toAdd.data = data;
		if(head==null) {
			head=toAdd;
			return;
		}
		Node temp =head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=toAdd;
		
		
	}
	 void print(){
		 if(isEmpty()) {
			 System.out.println("Linked List is empty");
			 return;
		 }
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data+ " ");
			temp=temp.next;
		}
	 }
	 int get(int val) {
		 if(head==null) {
				System.out.println("Head is null insert first");
				return -1;
				}
		Node temp = head;
		int index =0;
		 
		while(temp != null && temp.data != val ) {
			temp=temp.next;
			index++;
		}
		if(temp==null)
			return -1;
		return index;
	 }
	 int addAll() {
		 if(head==null) {
			 System.out.println("List is empty");
			 return  -1;
		 }
		 Node temp = head;
		 int sum = 0;
		 while(temp!=null) {
			sum+=temp.data;
			temp=temp.next;
		 }
		 return sum;
	 }
	 void removeNode(int data) {
		 if(head==null) {
			 System.out.println("empty");
			 return;
		 }
		 Node temp = head;
		 Node prev= temp;
		 if(head.data==data) {
			 head=head.next;
			 return;
		 }
		 temp=temp.next;
		 while(temp!=null) {
			  if(temp.data==data) {
				  prev.next= temp.next;
				  System.out.println("Succesfully deleted");
				  return;
			  }
			  prev=temp;
			  temp=temp.next;
		 	}
		 System.out.println("Not Found ");
	 }
	 boolean isEmpty() {
		 return head==null;
	 }
	 void removeAll() {
		 head=null;
		 return;
	 }
		 static class Node{
			 int data ;
			 Node next;
			 public Node(int data) {
				 this.data = data;
				 next= null;
			 }
		 }
		 
		 
		 
}

