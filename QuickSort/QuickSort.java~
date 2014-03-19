import java.util.*;
import java.io.*;

public class QuickSort{

    public int quickSelect(int[]l, int k){
	return quickSelect(l, k, 0, l.length-1);
    }

    public int quickSelect(int[] l, int k, int left, int right){
	int pivotI = partition(l, left, right);
	//quest complete
	if (pivotI == k)
	    return l[k];
	//try again
	else if (k<pivotI)
	    return quickSelect(l, k, left, pivotI-1);
	else
	    return quickSelect(l, k, pivotI+1, right);
    }

    public int partition(int[] l, int left, int right){
	// select a pivot within left and right

	Random r = new Random();
	int pivot = r.nextInt(left,right);
	
	// partition (put lower to left, higher to right)
	
	int compare = l[pivot];
	int leftint = left;
	int rightint = right;
	
	//swap pivot and last obj in array
	swap(l, pivot, l.length-1);

	//swap, check from left
	while (leftint != rightint + 1){
	    if (l[left]>compare){
		swap(l, left, right);
		right++;
	    }
	    else{
		left++;
	    }
	}
	
	//reinsert 
	swap(l, l[l.length-1], l[right]);
    }

    public void swap(int[] l, int a, int b){
	int tmp = l[a];
	l[a] = l[b];
	l[b] = tmp;
    }

    public static void main(String[] args){
	int[] l = {21,65,42,82,35,65,54,321,5,121,6531,16,351,341,213,1};
	
	this.partition(l
    }
       
}