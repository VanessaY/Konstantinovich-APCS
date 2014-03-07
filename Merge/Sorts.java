import java.io.*;
import java.util.*;

public class Sorts{

    public static void copy3(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
    	for (int i=0; i<a.size()/2; i++){
	    b.add(a.get(i));  
	}
	for (int i=0; i<a.size()-b.size(); i++){
	    c.add(a.get(b.size() + i));
	}

    }

    public static void copy2(ArrayList<String> original, ArrayList<String> copy){	
	copy.clear();
	for (int i=0; i<original.size(); i++){
	    copy.add(original.get(i));
	}		
    }
    
    public static void msort(ArrayList<String> a){
	if(a.size()>1){
	    //split a
	    ArrayList<String> b = new ArrayList<String>();
	    ArrayList<String> c = new ArrayList<String>();
	    copy3(a, b, c);

	    //msort each half
	    msort(b);
	    msort(c);

	    //ans = merge
	    ArrayList<String> ans = merge(b, c);

	    //copy ans into a
	    copy2(ans, a);
	}
    }   
    
    public static ArrayList<String> merge(ArrayList<String> a, 
					  ArrayList<String> b){
	ArrayList<String> result = new ArrayList<String>();
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

    public static String name(){
        return "Yu, Vanessa";
    }

}
