import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){
	Sorts fixed = new Sorts();
	Naivesort naive = new Naivesort();
	NSorts orig = new NSorts();
	
	int[] list = orig.randomthing(10000000);
	
	long n1 = System.currentTimeMillis();
        orig.msort(list);
	long n2 = System.currentTimeMillis();
	System.out.println("Original: " + (n2 - n1));
	
	list = orig.randomthing(10000000);
	long n3 = System.currentTimeMillis();
        naive.msort(list);
	long n4 = System.currentTimeMillis();
	System.out.println("Naive: " + (n4 - n3));

	list = orig.randomthing(10000000);
	long n5 = System.currentTimeMillis();
	fixed.msort(list);
	long n6 = System.currentTimeMillis();
	System.out.println("Fixed: " + (n6 - n5));

	list = orig.randomthing(10000000);
	long n7 = System.currentTimeMillis();
	Arrays.sort(list);
	long n8 = System.currentTimeMillis();
	System.out.println("Builtin: " + (n8 - n7));
    }
}
