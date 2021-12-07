package org.karnan.java.factors;

public class FactorFinder {

	public static void main(String[] args) {
		boolean fot = false;
		boolean fof = false;

		FactorFinder driver = new FactorFinder();

		for(int i=1; i<=100; i++) {
			
			fot = driver.factorOfothree(i);
			fof = driver.factorOfofive(i);

			if((fot==false) & (fof ==false)) {
				System.out.println(i);				
			}
			else if ((fot==false) & (fof ==true)) {
				System.out.println("Fizz");				
			}

			else if ((fot==true) & (fof ==false)) {
				System.out.println("Buzz");				
			}

			else if ((fot==true) & (fof ==true)) {
				System.out.println("FizzBuzz");				
			}
			else {
				System.out.println(i);
				System.out.println("Karnan");
			}

		}
	}

	public boolean factorOfothree(int num) {
		int result = num%3;
		boolean factor = false;
		if(result!=0) {
			factor=false;
		}

		else if (result==0) {
			factor=true;
		}

		return factor;
	}

	public boolean factorOfofive(int num) {
		int result = num%5;
		boolean factor = false;
		if(result!=0) {
			factor=false;
		}

		else if (result==0) {
			factor=true;
		}		
		return factor;
	}
}
