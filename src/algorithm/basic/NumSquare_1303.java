package algorithm.basic;

import java.util.Scanner;

/**
 * http://www.jungol.co.kr/problem.php?ctc=02&id=1303
 * @author hongsikalexlee
 *
 */
public class NumSquare_1303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int v = 1;
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				System.out.print(v+" ");
				v++;
			}
			System.out.println();
		}

	}

}
