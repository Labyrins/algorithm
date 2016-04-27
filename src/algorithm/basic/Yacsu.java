/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=678&sca=2020
 */

package algorithm.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Yacsu {

	static ArrayList<Integer> list = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		for(int i=1; i<a;i++ ){
			if(a%i==0){
				list.add(i);
			}
		}
		if(b>list.size()){
			System.out.println(0);
		}else{
			System.out.println(list.get(b-1));
		}

	}
	

}
