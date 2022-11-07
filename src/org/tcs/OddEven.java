package org.tcs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OddEven {
public static void main(String[] args) {
	List<Integer>l=new ArrayList();
	List<Integer>even=new ArrayList();
	List<Integer>odd=new ArrayList();
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(35);
	l.add(40);
	l.add(45);
for (int i = 0; i < l.size(); i++) {
	Integer li = l.get(i);
	if (li%2==0) {
		even.add(li);
	}
	else {
	odd.add(li);
	
	}
	
}
System.out.println(even);
	System.out.println(odd);
}
}
