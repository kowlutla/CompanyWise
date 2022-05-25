/**
  
 */
package LRUCacheImplementation;

import java.util.HashMap;

/**
 * @author apiiit-rkv
 *
 */
public class LRUImplementation {

	/**
	 * @param args
	 */
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	
	HashMap<Integer,Node>cache;
	int capacity;
	Node head;
	Node tail;
	
	public LRUImplementation(int capacity)
	{
		this.capacity=capacity;
		cache=new HashMap<Integer,Node>(capacity);
	}
	
	
	
	public void addToHead(Node node)
	{
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	
	
	public void deleteNode(Node node)
	{
		if(node==head)
		{
			head=node.next;
		}
		if(node==tail)
		{
			tail=node.prev;
		}
		if(node.prev!=null)
		{
			node.prev.next=node.next;
		}
		if(node.next!=null)
		{
			node.next.prev=node.prev;
		}
		
	}
	
	
	public void look(int k)
	{
		if(cache.containsKey(k))
		{
			Node keyNode=cache.get(k);
			deleteNode(keyNode);
		}
		else
		{
			if(cache.size()==capacity)
			{
				int tail_key=tail.data;
				deleteNode(tail);
				cache.remove(tail_key);
			}
		}
		
		Node node=new Node(k);
		addToHead(node);
		cache.put(k, node);
		System.out.println("Accessed item: "+k);
		printCache();
	}
	
	
	private void printCache() {
		System.out.print("Cache: ");
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}



	public static void main(String[] args) {
		
		LRUImplementation lru=new LRUImplementation(4);
		lru.look(1);
		lru.look(2);
		lru.look(3);
		lru.look(4);
		lru.look(5);
		lru.look(3);
	

	}

}
