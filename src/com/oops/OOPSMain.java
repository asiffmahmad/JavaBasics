package com.oops;

public class OOPSMain {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		System.out.println("Class>>" + b.messageA());
		System.out.println("Class>>" + b.messageB());
		System.out.println("Class>>" + c.messageA());
		System.out.println("Class>>" + c.messageB());
	}
}
