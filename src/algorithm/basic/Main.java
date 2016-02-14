package algorithm.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=a;i>0;i--){
			for(int z=i;z<a;z++){
				System.out.print(" ");
			}
			for(int y=i;y>0;y--){
				System.out.print("*");
			}
			for(int y=i-1;y>0;y--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}

// 소수점 두번째 자리 반올림 System.out.printf("%.2f",y);
//5 * 1 =  5   4 * 1 =  4   3 * 1 =  3
//5 * 2 = 10   4 * 2 =  8   3 * 2 =  6