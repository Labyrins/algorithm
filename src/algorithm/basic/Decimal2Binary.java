package algorithm.basic;

import java.util.Scanner;

public class Decimal2Binary {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n  = sc.nextInt();
		sc.close();
		System.out.println(Integer.toBinaryString(n));
	}

}
