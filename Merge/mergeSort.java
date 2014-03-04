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

    public void msort(int[]a){
	int[] ans = new int[a.length];
	int[] b, c;
	if(a.length>1){
	    //split a
	    b = new int[a.length/2];
	    c = new int[a.length - b.length];

	    //copy function (make one) a into the 2 arrays
	    for (int i=0; i<b.length; i++){
		b[i] = a[i];
	    }
	    for (int i=0; i<c.length; i++){
		c[i] = a[b.length + i];
	    }

	    //msort each half
	    msort(b);
	    msort(c);
	    
	    //ans = merge
	    ans = merge(b, c);

	    //copy ans into a
	    a.copyOf(ans, ans.length);
	}
	else{
	    a.copyOf(a);
	}   
    }
    public int[] merge(int[] a, int[] b){
	int[] result = new int[a.length + b.length];
	int currenta = 0;
	int currentb = 0;

	for(int i=0; i<a.length + b.length; i++){
	    System.out.println(currenta + ", " + currentb);
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
