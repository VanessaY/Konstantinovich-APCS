public class MyLinkedList{
    private Node head;

    public MyLinkedList(){
	head=null;
    }
    
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
	Node n = head;
	for (int i=0; i<position; i++){
	    n = n.getNext();
	}
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

	//set new node's next to pos+1

	//set pos-1's node to pos
    }
    
    public void set(int position,String newString) {
	//get to pos

	//setdata to newstring
    }
      
    public void remove(int position) {
	//get to pos-1
	
	//set pos-1's next to pos+1

	//set pos's next to null
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
