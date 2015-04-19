package algorithm;

import java.util.Scanner;


public class Factorial {
	static int sum = 1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		fac(input);
		System.out.println(sum);
	}
	
	public static void fac(int x){
		if(x==1){
			System.out.println("1! = 1");
		}else{
			System.out.println(x+"!"+ " = " + x +" * " + (x-1) +"!");
			sum *= x;
			fac(x-1);
		}
	}

}
