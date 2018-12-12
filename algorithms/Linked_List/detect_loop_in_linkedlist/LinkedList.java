public class LinkedList {
	Node head;
	
	void isCycle() {	
	Node s = head;
	Node f = head;

	while(s.next!=null && f.next.next!=null)
	{
		f = f.next.next;
		s = s.next;
		if(f == s || f.next == s)
			{
				return 1;
			}
		return 0;
	}

}

