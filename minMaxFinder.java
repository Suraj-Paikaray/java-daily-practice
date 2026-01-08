package javaPrograms;

import java.util.Scanner;
public class minMaxFinder {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int bada = Maximum(a,b,c);
		System.out.println(bada);
		int chota = Minimum(a,b,c);
		System.out.println(chota);
			}
			
	static int Maximum(int a, int b, int c){
		int max = a;
		
		if (b>max){
			max = b;
		}
		if (c>max){
			max = c;
		}
			return max;
		}
		
		static int Minimum(int a, int b, int c){
	return Math.min(a,Math.min(b,c));
		}
		
	}
	