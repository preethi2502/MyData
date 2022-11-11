package com.data.in;

import com.datatype.in.Access;

public class Sources {

	public void schData() {
		System.out.println("sch address chennai");
	}

	public void schData(String name) {
		System.out.println("School name " + name);
	}

	public static void main(String[] args) {
		Sources s = new Sources();
		s.schData();
		s.schData("MAK");

	}

}
