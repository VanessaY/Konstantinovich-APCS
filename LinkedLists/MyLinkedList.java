public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head=null;
    }
    
    //make prelist node

    public Node getNode(int i) throws Exception{
	node n = head;
	
	if (i<0){
	    throw new Exception("Linked List index negative out of bounds");
	}

	while (i>0){
	    if (current.getNext() != null){
		current = current.getNext();
		i--;
	    }
	    else{
		throw new Exception("Linked List index out of bounds");
	    }
	}
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //SET IT TO A VARIABLE TO DO LATER
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public int length(){
	size = 0;
	Node next = head;;
	while(next != null){
	    size++;
	    next = next.getNext();
	}
	return size;
    }
    
    public String get(int position){
	Node n = getNode(i);
	return n.toString();
    }
    
    public String toString(){
	String[] s = new String(length());
        Node n = head;
	for (int i=0; i<length(); i++){
	    s[i] = n.toString();
	    n = n.getNext();
	}
	return Arrays.toString(s);
    }

    public void add(String s, int position) {
	//if pos >= len throw exception
	
	//create node with s
	Node n = new Node(s);
	
	if (i==0){
	    n.setNext(head);
	    head=tmp;
	}
	
	else{
	    Node pos = getNode(position-1);
	    
	    n.setNext(current.getNext());
	    current.setNext(n);
	}
    }
    
    public void set(int position,String newString) {
	//get to pos
	Node n = getNode(position);

	//setdata to newstring
	n.setData(newString);
    }
      
    public void remove(int position) throws Exception{
	//if removing from 0 cannot because removing from empty list
	if (i==0){
	    if(head==null){
		throw new Exception("Removing from empty list");
	    }
	}
	
	//get to pos-1
	Node pos = getNode(position -1);
	Node removed = getNode(position);
	//if one before doesn't exist cannot because doesn't exist
	if(pos.getNext() == null){
	    throw new Exception("Node doesn't exist");
	}

	//set pos-1's next to pos+1
	pos.setNext(pos.getNext().getNext());
	
	//set pos's next to null
	removed.setNext(null);
    }
      
    public int find(String s){
	Node n = head;
	for (int i=0; i<length(); i++){
	    if (n.getData().equals(s)){
		return i;
	    }
	    n = n.getNext();
	}
	return -1;
    }

}
