import java.io.*;
import java.util.*;

public class Person implements Comparable{
    
    private String name;

    public Person(String s){
	name = s;
    }

    public String toString(){
	return name;
    }

    public String getName(){
	return name;
    }

    public int compareTo(Object other){
	if (other instanceof Person){
	    String othername = ((Person)other).getName();
	    return name.compareTo(othername);
	}
	return 0;	
    }
}