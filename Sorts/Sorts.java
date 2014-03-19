import java.io.*;
import java.util.*;

public class Sorts{
    
    public static void copy3(ArrayList<T> a,
			     ArrayList<T> b,
			     ArrayList<T> c){
    	for (int i=0; i<a.size()/2; i++){
	    b.add(a.get(i));  
	}
	for (int i=0; i<a.size()-b.size(); i++){
	    c.add(a.get(b.size() + i));
	}

    }

    public static void copy2(ArrayList<T> original, 
			     ArrayList<T> copy){	
	copy.clear();
	for (int i=0; i<original.size(); i++){
	    copy.add(original.get(i));
	}		
    }

    //returns class of type T
    //Requires arraylist of T
    public static <T extends Comparable<T>> void msort(ArrayList<T> a){
	if(a.size()>1){
	    //split a
	    ArrayList<T> b = new ArrayList<T>();
	    ArrayList<T> c = new ArrayList<T>();
	    copy3(a, b, c);

	    //msort each half
	    msort(b);
	    msort(c);

	    //ans = merge
	    ArrayList<T> ans = merge(b, c);

	    //copy ans into a
	    copy2(ans, a);
	}
    }    
    
    public static ArrayList<T extends Comparable<T>> merge(ArrayList<T> a,
							   ArrayList<T> b){
	ArrayList<T> result = new ArrayList<T>();
	int currenta = 0;
	int currentb = 0;
	
	for(int i=0; i<a.size() + b.size(); i++){
	    if (currentb >= b.size() ||
		(currentb < b.size() && currenta < a.size() 
		 && b.get(currentb).compareTo(a.get(currenta)) > 0)){
		result.add(a.get(currenta));
		currenta = currenta + 1;
	    }
	    
	    else{
		result.add(b.get(currentb));
		currentb = currentb + 1;
	    }
	}
	return result;
    }
       
}
