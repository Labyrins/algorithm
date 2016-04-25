/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1722&sca=2020
 */

package algorithm.basic;

import java.util.Scanner;

public class SumOfSingleNums {

	static String n;
	static int sum = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		sc.close();
		getNum(n);
		
		
	}
	
	public static void getNum(String s){
		int t;
		sum = 0;
		for(int i=0; i<s.length();i++){
			t= Integer.parseInt(""+s.charAt(i));
			sum += t;
		}
		System.out.println(sum);
		if(sum>9){
			getNum(sum+"");
		}
		
	}

}
