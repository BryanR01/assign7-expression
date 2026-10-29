package assignment;

public class Stack<T> implements StackInterface{
	protected Node<T> head;
	//protected Node tail;
	int size;

	@Override
	public void push(Object item) {
		Node<T> newNode=new Node(item);
		newNode.next=head;
		head=newNode;
		size++;//Might now work*
		
	}

	@Override
	public Object pop() {
		Node<T> deleted=new Node();
		head=head.next;
		return deleted;
	}

	@Override
	public Object peek() {
		return head;
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
