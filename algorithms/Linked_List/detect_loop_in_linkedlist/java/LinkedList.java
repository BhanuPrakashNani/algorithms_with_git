
public class LinkedList {
	Node head;
	int num=0;
	public void printlist() {
		Node n=head;
		while(n!=null) {
		System.out.println(n.data+"");
		n=n.next;
		}
	}
	
	void evenprint() {
		Node n=head.next;
		while(n!=null) {
			System.out.println(n.data+" ");
			if(n.next==null) {
				break;
			}
			n=n.next.next;
			
		}
	}
	
	public void isEmpty() {
		if(head==null) {
			System.out.println("The list is Empty");
		}
		else {
			System.out.println("Not empty");
		}
	}
	
	public void isLast(int data) {
		Node t=head;
		while(t.data!=data) {
			t=t.next;
		}
		if(t.next==null) {
			System.out.println("Is last element");
		}
		else {
			System.out.println("Not last element");
		}
	}
	public void deleteData(int data) {
		
		Node t=head;
		int p=1;
		while(t.data!=data) {
			t=t.next;
			p++;
		}
		deleteAtPos(p);
		
	}
	
	public void deleteAtPos(int pos) {
		
		Node t=head;
		if(pos==1) {
			
			deleteFirst();
		}
		else {
		for(int i=1;i<pos-1;i++) {
			t=t.next;
		}
		Node p=t.next;
		t.next=p.next;
		p.next=null;
		num--;
	}
	}
	
	public void insertfirst(int data) {
		num++;
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	public void deleteFirst() {
		num--;
		if(head==null) {
			System.out.println("The list is empty");
		}
		else {
		Node t;
		t=head;
		head=head.next;
		t.next=null;
		}
	}
	
	public void insertLast(int data) {
		num++;
		Node t;
		Node n=new Node(data);
		if(head==null) {
			head=n;
		}
		else {
			t=head;
			if(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}
	}
	
	public void deleteLast() {
		num--;
		Node t;
		t=head;
		if(t.next.next!=null) {
			t=t.next;
		}
		t.next=null;
	}
	
	public void insertAtPos(int data, int pos)  {
		num++;
     	Node t=null;
        Node n = new Node(data);
  	  if(head == null && pos == 1)
   	 {
        head=n;
  	  }
  	  else if(pos==1) {
  		  insertfirst(data);
    }
  	  else {
  		  for(int i=1;i<pos-1;i++) {
  			  t=t.next;
  		  }
  		  n.next=t.next;
  		  t.next=n;
  	  }


	}
	
	void sortedInsertion(int data) {
		
		Node t=head;
		Node n=new Node(data);
		
		if(head==null) {
			num++;
			head=n;
		}
		else if(num==1) {
			if(t.data<data) {
				insertLast(data);
			}
			else {
			insertfirst(data);
		}
		}
		else {
			num++;
		while(head!=null && t.data<data && t.next.data<=data) {
			
			t=t.next;
		}
		n.next=t.next;
		t.next=n;
	}
	}
	void returnData(int n) {
		n=num-n;
		Node t=head;
		for(int i=1;i<=n;i++) {
			t=t.next;
		}
		System.out.println("The required data is "+t.data);
	}
	void middleElement(int n) {
		Node t=head;
	     if(n%2==0) {
	    	 for(int i=1;i<n/2;i++) {
	 			t=t.next;
	 		} 
	     }
	     else {
	    	 n=n+1;
	    	 for(int i=1;i<n/2;i++) {
	 			t=t.next;
	 		}
	     }
	     System.out.println("The middle element is"+t.data);
	}
	void removeDuplicate() {
		Node t=head;
		int p=1;
		while(t.next!=null) {
		if(t.data==t.next.data) {
			p++;
			deleteAtPos(p);
		}
		else {
			t=t.next;
			p++;
		}
	}
	}
	void intersection(LinkedList p) {
		Node t=this.head;
		Node h=p.head;
		LinkedList l=new LinkedList();
		while(t!=null) {
			while(h!=null) {
				if(t.data==h.data) {
					l.insertfirst(t.data);
				}
				h=h.next;
			}
			t=t.next;
			h=p.head;
		}
		Node m=l.head;
		while(m!=null) {
			System.out.println(m.data);
			m=m.next;
		}
	}
	void reverse() {
		Node prev=null;
		Node current=head;
		Node next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		
	}

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

	
	void printNthFromLast(int n)
    {
        int len = 0;
        Node temp = head;
        while (temp != null)
        {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return;
        temp = head;
        while(i!=len-n)
	{
            temp = temp.next;
	}
        System.out.println(temp.data);
    }


	void palindrome() {
	LinkedList l = new LinkedList();
	Node t = head;
	while(t!=null)
	{
		l.insertAtFront(t.data);
		t = t.next;
	}
	t= head;
	Node h = l.head;
	while(t!=null)
	{
		if(t.data != h.data)
		{
			System.out.println("Not palindrome");
		}
	t= t.next;
	h = h.next;

}
