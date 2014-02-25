import java.io.*;
import java.util.*;

public class Recursion{
    public long fact(int n){
	if (n==0)
	    return 1;
	else
	    return n * fact(n-1);
    }

    public long fibRec(int n){
	if (n == 0)
	    return 1;
	else if (n == 1)
	    return 1;
	else
	    return fibRec(n - 1) + fibRec(n - 2);
    }

    public long fibIter(int n){
	return fibIterHelper(0, 1, n);
    }
    
    public long fibIterHelper(int prev, int prevPrev, int n){
	if (n == 0)
	    return prev + prevPrev;
	else{
	    int p = prev + prevPrev;
	    return fibIterHelper(p, prev, n-1);
	}
    }

}
