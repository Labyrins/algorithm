/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=2074
 */

package algorithm.basic;

import java.util.Scanner;

public class CharTriangle1 {

	static String[][] map;
	static int n;
	static char count = 65;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		map = new String[n][n];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
					map[i][j] = " ";
			}
		}
		
		int size = n-1;
		int a = 0;
		while(size>=a){
			for(int i=size; i>=a; i--){
				map[size-i+a][i] = getString();
			}
			a++;
		}
		
		PrintMap();

	}
	
	public static void PrintMap(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static String getString(){
		String str = String.valueOf(count); 
		count++;
		if(count>90) count=65;
		
		return str;
		
	}

}