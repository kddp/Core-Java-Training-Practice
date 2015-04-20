package com.uttara.test;

public class TestMyString {

	public static void main(String[] args)
	{
		char [] a = {'q','w','r'};
		
		MyString m = new MyString(a);
		System.out.println(m.size());
		
		MyString n = new MyString(a);
		System.out.println(m.equals(n));
	
	}

}

