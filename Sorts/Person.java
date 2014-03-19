import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{
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

    public int compareTo(Person other){
	String othername = ((Person)other).getName();
	return name.compareTo(othername);
    }
}
