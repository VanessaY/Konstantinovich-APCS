import java.util.*;

public class Driver{
    public static void main(String[] args){
	QuickSort q = new QuickSort();
	int[] l = {21,65,42,82,35,65,54,321,5,121,6531,16,351,341,213,1};
	
	q.quickSelect(l,5);
	System.out.println(Arrays.toString(l));
    }
}
