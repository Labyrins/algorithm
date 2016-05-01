/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=931
 */

package algorithm.basic;

import java.util.Scanner;

public class GcmAndLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int gcm=0;
		
		int k = (a>b)?b:a;
		
		for(int i=1; i<=k;i++){
			if(a%i==0 && b%i==0 && i>gcm){
				gcm=i;
			}
		}
		
		int lcm = (a*b)/gcm;
		
		System.out.println(gcm);
		System.out.println(lcm);

	}

}
