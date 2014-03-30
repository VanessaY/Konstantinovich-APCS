import java.util.*;
import java.io.*;

public class Sorts{

    public static void quickSort(int[]l){
	quickSort(l, 0, l.length-1);
    }

    public static void quickSort(int[] l, int left, int right){
	if (right-left<2){
	    return;
	}
	int pivotI = partition(l, left, right);
        quickSort(l, left, pivotI-1);    
	quickSort(l, pivotI+1, right);
    }

    public static int partition(int[] l, int left, int right){

	//partition around a random number
	int pivot = left + (int)(Math.random() * (right-left+1));
	
	//bounds and comparison
	int lb = left;
	int rb = right;
	int compare = l[pivot];
	
	//swap pivot to end
	swap(l, pivot, right);

	for (int i=lb; i<right; i++){
	    //if current less than compare, swap with left
	    //everything to left of lb is correct
	    if (l[i] < compare){
		if (i!= lb){
		    swap(l, i, lb);
		}
		lb++;
	    }
	    //if current greater than compare, swap with right
	    //everything to right of rb is correct
	    //nope

	    //swap back
	    }
	    if(l[lb] < compare){
		swap(l, lb+1, right);
		return lb+1;
	    }
	    else{
		swap(l, lb, right);
		return lb;
	    
	}
	//i couldn't get the duplicates to work
        
    }

    public static void swap(int[] l, int a, int b){
	int tmp = l[a];
	l[a] = l[b];
	l[b] = tmp;
     }

}
