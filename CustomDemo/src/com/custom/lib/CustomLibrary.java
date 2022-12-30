package com.custom.lib;

public class CustomLibrary {
	class CustomeLib {
		public void welcomeMessage() {
		System.out.println("Hello Everyone\nGood Morning");
		}
		
		public int add(int a,int b) {
		return (a+b);
		}
		
		public String checkEvenOdd(int number) {
		if((number % 2 )==0)
		return "Given Number is Even";
		else
		return "Given Number is Odd";
		}
	}
}
