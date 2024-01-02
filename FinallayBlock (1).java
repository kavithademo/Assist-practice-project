package com.simplilearn.ExceptionHandling;

public class FinallayBlock {

	public static void main(String[] args) {
		int x=10,y=20;
		int z=x+y;
		try {
		if(z==x) {
			System.out.println("It's equal");
		}else if(z/0==0) {
			System.out.println("Z is divible by zero.");
		}
		else {
			return;
		}
		}catch(ArithmeticException e) {
			System.out.println("Number is not divisible by zero");
		}finally {//finally block
			System.out.println("Even exception nor return also finally block will also gets execute.");
		}
		

	}
	

}
