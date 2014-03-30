public class Driver{
    public static void main(String[] args) {
	MyLinkedList<String> l = new MyLinkedList();
	l.add("asdf", 0);
	l.add("qwer", 1);
	l.add("zxcv", 2);
	l.add("2345", 2);
	System.out.println(l.get(2));
    }
}
