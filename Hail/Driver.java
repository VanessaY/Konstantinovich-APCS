public class Driver{
    public static void main(String[] args){
	Hail h = new Hail();
	h.hail(5);
	System.out.println("Length: " + h.hailLen(5));
	System.out.println("");
	System.out.println("Longest Hail 1-5: " + h.longestHail(5));
    }
}
