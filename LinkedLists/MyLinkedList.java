public class MyLinkedList{
    private Node head;

    /*
      -void add(String s, int position) 
      //create a node containing s and add it to the position location. 
      Throw an exception if position>=length of the list.
      
      -void set(int position,String newString) 
      // change the value of the string found at 
      the indicated position to newString
      
      -void remove(int position)
      //remove the Node from that location.
      
      -int find(String s)
      //return the location of the 1st occurance of s in the list, -1 if the string isn't found.
      
      -String toString() 
      //convert the list to a string in the format 
      "[ word1 , word2 , word3]"
    */
    
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
	String[] s = new String(length);
	//stuff KEEP DO
    }
}