package com.datatype.in;

public class Student {

	//method
	public void stuName() {
		System.out.println("tamil");
	}

	public void stuSub() {
		System.out.println("Tamil");
	}

	public static void main(String[] args) {
//object 
		//classname obj/ref  = keyword classname();
		Student  stu = new Student();
		stu.stuName();
		stu.stuSub();
 	}

}
