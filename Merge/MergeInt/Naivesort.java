public class Naivesort{
    public static void msort(int[] a) {
	if (a.length<2)
	    return;
	int[] b,c;
	b = new int[a.length/2];
	c = new int[a.length-b.length];
	
	copy(a,0,b,0,b.length);
	copy(a,b.length,c,0,c.length);

	msort(b);
	msort(c);
	
	int[] res = merge(b,c);
	
	copy(res,0,a,0,a.length);
    }
    

    public static void copy(int[]source,int sstart, int[]dest, int dstart, int count) {	
	for (int i=0; i<count; i++) {
	    dest[dstart+i] = source[sstart+i]; // i = offset
	}
    }
    
    public static int[] merge(int[] a, int[] b){
	int[] res = new int[a.length+b.length];
	int ia=0; //index for a
	int ib=0; //index for b
	while (ia<a.length || ib<b.length) { 
	    if (ia<a.length && (ib>=b.length || a[ia]<b[ib])) { 
		res[ia+ib] = a[ia];
		ia++;
	    }
	    else {
		res[ia+ib] = b[ib];
		ib++;
	    }
	}
	return res;
    }
}
