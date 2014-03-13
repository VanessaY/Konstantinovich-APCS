import java.util.*;
import java.io.*;

public class QuickSort{

    public int quickSelect(int[]l, int k){
	return quickSelect(l, k, 0, l.length-1);
    }

    public int quickSelect(int[] l, int k, int left, int right){
	
    }

    public int partition(int[] l, int left, int right){
	// select a pivot within left and right

	Random r = new Random();
	int pivot = r.nextInt(left,right);
	
	// partition (put lower to left, higher to right)
	
	int compare = l[pivot];
	int leftint = left;
	int rightint = right;

	// 5, 6, 4, 8, 32, 1, 78, 5
	while (leftint != rightint){
	   

	// return index of pivot
	
    }
}