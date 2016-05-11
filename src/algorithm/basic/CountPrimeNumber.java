/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=2079
 */

package algorithm.basic;

import java.util.Scanner;

public class CountPrimeNumber {

	static int m, n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		sc.close();

		int result = 0;
		if(m==1 && n==1){
			System.out.println(result);
		}else{
			
			for(int i=m;i<=n;i++){
				if(isPrime(i)) result++; 
			}
			System.out.println(result);
		}
	}

	private static boolean isPrime(int num) {
		
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
