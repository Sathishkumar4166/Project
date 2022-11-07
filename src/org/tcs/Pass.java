package org.tcs;

public class Pass {
	private static Pass name;
	private Pass() {
	}
	public static Pass getname() {
		if (name==null) {
			name=new Pass();
		}
		return name;
}
	public void Add() {
		System.out.println("n");
	}
	
}