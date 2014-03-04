import java.io.*;
import java.util.*;

//a and b are sorted
//smaller numbers into smaller indices

public class mergeSort{

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
