package javaPrograms;
import java.util.Scanner;
public class functionElection {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int age = in.nextInt();
		if(vote(age)) {
	    System.out.println("Eligible to vote");
		}else {
            System.out.println("Not eligible to vote");
        }
		
	   } 
	   
	   static boolean vote (int age){
		   return age >= 18;
		  
		   }
			   
		   
	   }