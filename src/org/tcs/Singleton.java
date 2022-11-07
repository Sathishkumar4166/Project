package org.tcs;

public class Singleton {
	static Singleton object;
	private Singleton() {
	}
	public static Singleton getobject() {
		if(object==null);{
		System.out.println("before object creation:"+System.identityHashCode(object));
		object=new Singleton();
		System.out.println("after object creatioh:"+System.identityHashCode(object));		
	}
	return object;
}
	private void add() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Singleton object2=getobject();
		object2.add();
		System.out.println(System.identityHashCode(object2));
	Singleton object3=getobject();
	System.out.println(System.identityHashCode(object3));
	}
}