package javaPrograms;

import java.util.Scanner;
public class functionFactorial {
	public static void main(String[] args){
	System.out.println("Please give your number: ");

		Scanner in = new Scanner(System.in);
		int userInput = in.nextInt();
		int fct = Factorial(userInput);
		System.out.println(fct);
		
	}
	
      static int Factorial (int number) {
      int facto = 1;
	  for (int i = 1; i<=number; i++){
		  facto = facto * i;
	     }
		  return facto;
	  }

	
}