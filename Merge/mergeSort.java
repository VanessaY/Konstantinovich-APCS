import java.io.*;
import java.util.*;

//a and b are sorted
//smaller numbers into smaller indices

public class mergeSort{
    
    public void copy3(int[] a, int[] b, int[] c){
	for (int i=0; i<b.length; i++){
	    b[i] = a[i];
	}
	for (int i=0; i<c.length; i++){
	    c[i] = a[b.length + i];
	}
    }

    public void copy2(int[] original, int[] copy){
	for (int i=0; i<copy.length; i++){
	    copy[i] = original[i];
	}
    }
    
    public void msort(int[]a){
	if(a.length>1){
	    //split a
	    int[] b = new int[a.length/2];
	    int[] c = new int[a.length-b.length];
	    copy3(a, b, c);

	    //msort each half
	    msort(b);
	    msort(c);

	    //ans = merge
	    int[] ans = merge(b, c);

	    //copy ans into a
	    copy2(ans, a);
	}
    }   
    
    public int[] merge(int[] a, int[] b){

	int[] result = new int[a.length + b.length];
	int currenta = 0;
	int currentb = 0;

	for(int i=0; i<a.length + b.length; i++){

	    if (currentb >= b.length ||
		(currentb < b.length && currenta < a.length 
		 && b[currentb] >= a[currenta])){
		result[i] = a[currenta];
		currenta = currenta + 1;
	    }
	    
	    else{
		result[i] = b[currentb];
		currentb = currentb + 1;
	    }
	}
	return result;
    }
    
    //testing purposes only pls dont look thank
    public int[] randomthing(int l){
	Random r = new Random();
	int[] x = new int[l];
	for (int i=0; i<l; i++){
	    x[i] = r.nextInt(10000);
	}
	return x;
    }

}
