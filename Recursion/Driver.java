public class Driver{
    public static void main (String[] args){
	Recursion r = new Recursion();
	System.out.println(r.fact(5));
	for (int x = 0; x<5; x++){
	    System.out.println(r.fibRec(x));
	    System.out.println(r.fibIter(x));
	}
    }
}
       
