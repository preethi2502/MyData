package com.datatype.in;

public class Data {

	// enum declared should be in the class
	public enum COLOUR {
		BLACK, WHITE, RED, GREEN, BLUE
	}

	public static void main(String[] args) {
		// particular data
		COLOUR data = COLOUR.BLACK;
		System.out.println(data);

		// all data print
		for (COLOUR clr : COLOUR.values()) {
			System.out.println(clr);
		}

	}

}
