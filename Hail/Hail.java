import java.io.*;
import java.util.*;

public class Hail{
    
    int count = 0;

    public void hail(int n){
	System.out.println(n);
	count = count+1;
	if (n==1)
	    {}
	else if (n%2 == 0)
	    hail(n/2);
	else
	    hail(3*n + 1);
    }
    
    public int hailLen(int n){
	count = 0;
	hail(n);
	return count;
    }
    
    public int longestHail(int n){
	return longestHailHelp(0, n);
    }

    public int longestHailHelp(int currentLong, int n){
	if (hailLen(n) > currentLong)
	    currentLong = n;
	if (n==1)
	    return currentLong;
	else
	    return longestHailHelp(currentLong, n-1);
    }
}
