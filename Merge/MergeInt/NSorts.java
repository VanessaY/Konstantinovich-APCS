import java.io.*;
import java.util.*;

//a and b are sorted
//smaller numbers into smaller indices

public class NSorts{
    
    public static void copy(int[]source,int sstart, int[]dest, int dstart, int count) {	
	for (int i=0; i<count; i++) {
	    dest[dstart+i] = source[sstart+i]; // i = offset
	}
    }
    
    public void msort(int[]a){
	if(a.length>1){
	    //split a
	    int[] b = new int[a.length/2];
	    int[] c = new int[a.length-b.length];
	    copy(a, 0, b, 0, b.length);
	    copy(a, b.length, c, 0, c.length);
	    //msort each half
	    msort(b);
	    msort(c);

	    //ans = merge
	    int[] ans = merge(b, c);

	    //copy ans into a
	    copy(ans, 0, a, 0, a.length);
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
