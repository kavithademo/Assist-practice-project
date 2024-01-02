package com.simplilearn.ExceptionHandling;




public class ThrowsDemo {

	public static void main(String[] args)throws  ChancesArelessException{
		 Matrimony marriage=new Matrimony();
		 marriage.searchAlliance(52);
			 
		 }

	}

class ChancesArelessException extends Exception {
	
	
	
}
class Matrimony{
	public void searchAlliance(int age) throws ChancesArelessException {
		if(age<=30&&age>=21) {
			System.out.println("Eligible for First marriage.");
		}else if(age>=31&&age<=40) {
			System.out.println("Eligible for Second marriage");
		}else if(age>=41&&age<=60) {
			System.out.println("They are not eligible for marriage");
			
		}else {
			throw new ChancesArelessException();
		}
		
	}

}
