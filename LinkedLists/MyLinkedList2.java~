import java.io.*;
import java.util.*;


public class MyLinkedList{
    private Node head;
    private int length;
    public MyLinkedList(){
	head=null;
    }
    
    //make prelist node

    public Node getNode(int i) throws Exception{
	Node current = head;
	
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

	return current;
    }
    
    public int length(){
	return length;
    }
    
    public String get(int position) throws Exception{
	Node n = getNode(position);
	return n.toString();
    }
    
    public String toString(){
	String[] s = new String[length()];
        Node n = head;
	for (int i=0; i<length(); i++){
	    s[i] = n.toString();
	    n = n.getNext();
	}
	return Arrays.toString(s);
    }

    public void add(String s, int position) throws Exception{
	//if pos >= len throw exception
	
	//create node with s

	Node n = new Node(s);
	
	if (position==0){
	    n.setNext(head);
	    head=n;
	}
	
	else{
	    Node current = getNode(position-1);
	    
	    n.setNext(current.getNext());
	    current.setNext(n);
	}
	length++;
    }
    
    public void set(int position,String newString) throws Exception {
	//get to pos
	Node n = getNode(position);

	//setdata to newstring
	n.setData(newString);
    }
      
    public void remove(int position) throws Exception{
	//if removing from 0 cannot because removing from empty list
	if (position==0){
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

	length--;
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
