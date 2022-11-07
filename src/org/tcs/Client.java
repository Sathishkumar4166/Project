package org.tcs;

public class Client extends New {
	public Client() {
System.out.println("def");
}
public Client(float no) {
	super(1234);
System.out.println("123.23");
}
public static void main(String[] args) {
	Client a=new Client(1);
}
}