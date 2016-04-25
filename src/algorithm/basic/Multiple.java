/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=965&sca=2020
 */

package algorithm.basic;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m = sc.next();
		sc.close();
		System.out.println(n* Integer.parseInt(m.charAt(2)+""));
		System.out.println(n* Integer.parseInt(m.charAt(1)+""));
		System.out.println(n* Integer.parseInt(m.charAt(0)+""));
		System.out.println(n* Integer.parseInt(m));

	}

}
