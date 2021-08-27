package myLinkedList;

public class main {

	public static void main(String[] args) {
		LLinkedList  ll = new LLinkedList();
		for(int i=0;i<19;i++) {
			ll.add(i);
		}
		int number = ll.addAll();
		int foundAt = ll.get(34);
		ll.print();
		ll.removeNode(foundAt);
		ll.removeAll();
		ll.print();
		System.out.println(ll.isEmpty());
	}

}
