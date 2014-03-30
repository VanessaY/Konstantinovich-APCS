import java.util.*;

public class MyLinkedList<T>{
    private Node<T> head;
    private int length;


    public MyLinkedList(){
	head = new Node<T>(null);
    }

    //I got this from Elise
    public Node<T> getNode(int i){
	if (i<-1 || i>length){
	    throw new IndexOutOfBoundsException();
	}
	return getNode(head, -1, i);
    }

    public Node<T> getNode(Node<T> current, int currentPos, int pos){
	if (currentPos == pos){
	    return current;
	}
	else{
	    return getNode(current.getNext(), currentPos+1, pos);
	}
    }

    public T get(int pos){
	if (pos<0 || pos>length){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    return getNode(pos).getData();
	}
    }
    
    public void add(T s){
	add(s, 0);
    }

    public void add(T s, int pos){
	if (pos<0 || pos>length){
	    throw new IndexOutOfBoundsException();
	}
	
	else{
	    Node<T> n = new Node<T>(s);
	    Node<T> before = getNode(pos-1);
	    Node<T> after = before.getNext();
	    n.setNext(after);
	    before.setNext(n);
	    length++;
	}   
    }

    public void remove(int pos){
	if (pos<0 || pos>length){
	    throw new IndexOutOfBoundsException();
	}

	else{
	    Node<T> n = getNode(pos);
	    Node<T> before = getNode(pos-1);
	    Node<T> after = getNode(pos+1);
	    before.setNext(after);
	    length--;
	}
    }

    public void set (int pos, T t){
	if (pos<0 || pos>=length){
	    throw new IndexOutOfBoundsException();
	}

	getNode(pos).setData(t);
    }

    public int find(T t){
	Node<T> current = head.getNext();
	for (int i=0; i<length; i++){
	    if (current.getData().equals(t)){
		return i;
	    }
	    current = current.getNext();
	}
	return -1;
    }

    public int length(){
	return length;
    }

    public String toString(){
	String[] s = new String[length];
	Node current = head.getNext();
	for (int i=0; i<length; i++){
	    s[i] = current.getData().toString();
	    current = current.getNext();
	}
	return Arrays.toString(s);
    }

}   

