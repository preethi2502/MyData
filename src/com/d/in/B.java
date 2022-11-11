package com.d.in;

//child
public class B extends A {

	@Override
	public void testA() {
		super.testA();
	}

	@Override
	public void stuName(String name) {
		super.stuName(name);
	}

	public static void main(String[] args) {
		B b = new B();
		b.testA();
		b.stuName("jai");
	}

}
