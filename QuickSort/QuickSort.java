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
	int pivot = left + r.nextInt(right-left);
	
	// partition (put lower to left, higher to right)
	
	int compare = l[pivot];
	int leftint = left;
	int rightint = right-1;
	
	//swap pivot and last obj in array
	swap(l, pivot, l.length-1);

	//swap, check from left
	//i and l and right

	// l l l l l l
	// i i i i l l 
	// 2 3 4 2 4 4 8 8 8 8 8 8 5
	for (int i=left; i<right; i++){
	    if (l[i] < compare){
		swap(l, i, left);
		left++;
	    }
	}
      	if (l[left] >= compare){
	    swap(l, l.length-1, left);
	    return left;
	}
	else{
	    swap(l, l.length-1, left+1);
	    return left+1;
	}
    }

    public void swap(int[] l, int a, int b){
	int tmp = l[a];
	l[a] = l[b];
	l[b] = tmp;
    }

}
