package algorithm.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = (double) a;
		double y = x/b;
		
//		double z = Math.round(y*100d) / 100d;
		System.out.print((a/b) + " ");
		System.out.printf("%.2f",y);

	}

}
 


// 소수점 두번째 자리 반올림 System.out.printf("%.2f",y);