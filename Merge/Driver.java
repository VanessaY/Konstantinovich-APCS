import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){
	mergeSort M = new mergeSort();
	int[] list = M.randomthing(10000000);
	long n1 = System.currentTimeMillis();
        M.msort(list);
	long n2 = System.currentTimeMillis();
	System.out.println(n2 - n1);

	list = M.randomthing(10000000);
	long n3 = System.currentTimeMillis();
        Arrays.sort(list);
	long n4 = System.currentTimeMillis();
	System.out.println(n4 - n3);
    }
}
