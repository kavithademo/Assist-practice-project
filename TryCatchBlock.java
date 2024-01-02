package com.simplilearn.ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
        int bal=10000;
        
        // Try catch block example
        try {
        	System.out.println(bal/0);
        }catch(ArithmeticException e) {
        	System.out.println("Arithmetic Exception occurs.");
        	
        }
        System.out.println("--------------------------");
        cal("Amount",499);
        

	}
	public static void cal(String input,int num) {
		
		//Multiple try catch block example
		try {
			int x=Integer.parseInt(input);
			if(x==num) {
				System.out.println(num/x);
			}else {
				System.out.println(num*x);
			}
		}catch(NumberFormatException np) {//catch block with parameters
			System.out.println(np.getMessage());
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array Insex out of bounds exception occurs");
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs.");
		}
	}

}
