package baekjoon.basic;

import java.util.Scanner;

public class Star1_2438 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		for(int i=1; i<=a; i++){
			for(int j =0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
