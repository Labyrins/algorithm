/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=706&sca=2020
 */

package algorithm.basic;

import java.util.Scanner;

public class CountOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		Count(a * b *c);
		
	}
	
	public static void Count(long n){
		int[] table = new int[10];
		String temp = n+"";
		for(int i=0; i<10; i++){
			table[i] = 0;
		}
		int t =0;
		for(int i=0; i<temp.length(); i++){
			t = Integer.parseInt(temp.charAt(i)+"");
			table[t]++;
		}
		
		
		for(int i=0; i<10; i++){
			System.out.println(table[i]);
		}
		
	}

}
