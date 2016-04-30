/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=451
 */

package algorithm.basic;

import java.util.Scanner;

public class CountTiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		long mat = (long)a*(long)b;
		int x=0;
		
		int k = (a>b)?b:a;
		
		for(int i=1; i<=k;i++){
			if(a%i==0 && b%i==0 && i>x){
				x=i;
			}
		}
		
		System.out.println(mat);
		
		System.out.println(mat/(long)(x*x));
		
		
	}
	
	

}
