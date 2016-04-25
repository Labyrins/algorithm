/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=589&sca=2070
 */

package algorithm.basic;

import java.util.Scanner;

public class Factorial {

	static int n;
	static long result=1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		fact(n);
	}
	
	public static void fact(int n){
		
		if(n==1){
			System.out.println("1! = 1");
			System.out.println(result);
		}
		
		
		if(n-1>0){
			result = n*result;
			System.out.println(n+"! = "+n+" * "+ (n-1) + "!" );
			fact(n-1);
		}
	}

}
