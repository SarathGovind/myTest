//program to check linkedlist is palindrome or not

public class LinkedListPal{

Node head;
Node slow_ptr,fast_ptr,second_half;
Node next,prev;
Node current;
class Node {

char data;
Node next;
	Node(char d)
	{
	data =d ;
	next=null;
	}
}
public void push(char a)
	{
	//System.out.println(a);
	Node node=new Node(a);
	node.next=head;
	head=node;
	}
public void displayList(Node node)
	{
		while(node != null)
		{
		System.out.print(node.data+"->");
		node=node.next;
		}
		System.out.print("NULL");
		
	}
boolean isPalindrome(Node node)
	{
	boolean res=true;
        slow_ptr=fast_ptr=head;
	Node prev_slow_ptr=head;
	Node mid_node=null;
		if(head != null && head.next != null)
		{
			while(fast_ptr != null && fast_ptr.next != null)
			{
			fast_ptr=fast_ptr.next.next;
			prev_slow_ptr=slow_ptr;
			slow_ptr=slow_ptr.next;
			}
		
		if(fast_ptr!=null)   // for linked list having odd number of elements
		{
		mid_node=slow_ptr;
		slow_ptr=slow_ptr.next;
		}
		second_half=slow_ptr;
		prev_slow_ptr.next=null;
		reverse();
		res=compareNode(head,second_half);
			if (mid_node != null)  
            		{ 
               			prev_slow_ptr.next =mid_node;
				mid_node.next = second_half;
			}
			else
			prev_slow_ptr.next = second_half;
	}
	return res;
	}


public void reverse()
	{
	current=second_half;
	prev=null;
		while(current!=null)
		{
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		}
	second_half=prev;
	}
	
public boolean compareNode(Node head ,Node second_half)
	{
	Node temp1=head;
	Node temp2=second_half;
		while(temp1 !=null && temp2 != null)
		{
			if(temp1.data == temp2.data)
			{
			temp1=temp1.next;
			temp2=temp2.next;
			}
			else
			{
			return false;
			}
		
		}
		if(temp1 ==null && temp2 ==null)
		{
		return true;
		}	
	return false;
	}


public static void main (String args[])
{
LinkedListPal llist=new LinkedListPal();
char [] str={'y','a', 'b', 'c' ,'k','c', 'b', 'a','f'};
String st= new String (str);
for(int i=0;i<str.length;i++)
	{
	//System.out.println(str[i]);
	llist.push(str[i]);
	}
llist.displayList(llist.head);
System.out.println();
//System.out.println("Reversing.....");
//llist.reverse();
llist.displayList(llist.head);
if(llist.isPalindrome(llist.head) != false)
	{
	System.out.println("Is palindrome");
	}
else
	{
	System.out.println("Not Palindrome");
	}
}
}
