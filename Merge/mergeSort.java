import java.io.*;
import java.util.*;

//a and b are sorted
//smaller numbers into smaller indices

public class mergeSort{
    /*
      void msort(int[]a)
      if(length > 1)
      make 2 smaller arrays
      copy a to the small arrays (copy function)
      msort each half
      ans = merge (L1, L2)
      copy ans to a
      copyof?
    */
    
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
    /*
    public void msort(int[]a){
	int[] ans = new int[a.length];
	int[] b = new int[a.length/2];
	int[] c = new int[a.length-b.length];

	if(a.length>1){
	    //split a
	    copy3(a, b, c);

	    //msort each half
	    msort(b);
	    msort(c);
	    
	    //ans = merge
	    ans = merge(b, c);
	    
	    //copy ans into a
	    copy2(ans, a);
	}
    }   
    */
    public int[] merge(int[] a, int[] b){
	int[] result = new int[a.length + b.length];
	int currenta = 0;
	int currentb = 0;

	for(int i=0; i<a.length + b.length; i++){
	    if (currenta == a.length){
		for (int x=currentb; x<b.length; x++){
		    result[i] = b[x];
		}
		return result;
	    }

	    else if (currentb == b.length){
		for (int x=currenta; x<a.length; x++){
		    result[i] = a[x];
		}
		return result;
	    }
	    
	    else{
		if (a[currenta] < b[currentb]){
		    result[i] = a[currenta];
		    currenta = currenta + 1;
		}
		else if (b[currentb] < a[currenta]){
		    result[i] = b[currentb];
		    currentb = currentb + 1;
		}
	    }
	}
	return result;
    }

}
