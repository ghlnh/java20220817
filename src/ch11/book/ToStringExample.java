package ch11.book;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1= new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());	//java.lang.Object@2a139a55
		System.out.println(obj2.toString());	//Tue Sep 06 11:04:32 KST 2022
	}

}
