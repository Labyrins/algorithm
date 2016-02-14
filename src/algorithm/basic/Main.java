package algorithm.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=1;i<=b;i++){
			for(int y=1;y<=a;y++){
				System.out.print("("+i+", "+y+ ") ");
			}
			System.out.println();
		}
		
		
	}

}

// 소수점 두번째 자리 반올림 System.out.printf("%.2f",y);
//5 * 1 =  5   4 * 1 =  4   3 * 1 =  3
//5 * 2 = 10   4 * 2 =  8   3 * 2 =  6