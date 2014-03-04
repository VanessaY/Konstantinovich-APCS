import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){
	mergeSort M = new mergeSort();
	int[] a = {1,12,13,42,50,3,9,14,100};
	int[] b = {0};
	M.copy(a, b);
	System.out.println(Arrays.toString(b));

    }
}
