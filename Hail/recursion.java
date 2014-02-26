public class recursion{
    public String lastName(){
        /*change this! to your name*/
        return "Yu";
    }
    public String firstName(){
        /*change this! to your name*/
        return "Yan";
    }

    int count = 0;
    public void hail(int n){
	count = count+1;
	if (n==1)
	    {}
	else if (n%2 == 0)
	    hail(n/2);
	else
	    hail(3*n + 1);
    }

    public int hailLen(int n){
        /*put in your code here...*/
	count = 0;
	hail(n);
	return count;
    }

    public int longestHail(int n){
        /*put in your code here...*/
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

    public int fibIterHelper(int prev, int prevPrev, int n){
	if (n == 0)
	    return 0;
	if (n == 1)
	    return prev + prevPrev;
	else{
	    int p = prev + prevPrev;
	    return fibIterHelper(p, prev, n-1);
	}
    }

    public int fibItr(int n){
        /*put in your code here...*/
	return fibIterHelper(0, 1, n);
    }

    public recursion(){
        /*leave alone*/
    }
}
