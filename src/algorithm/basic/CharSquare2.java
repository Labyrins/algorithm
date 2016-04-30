/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=2072&sca=2010
 */

package algorithm.basic;

import java.util.Scanner;

public class CharSquare2 {

	static char count = 65;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String[][] mat = new String[n][n];
		
		for(int i=0; i<n; i++){
			if(i%2==0){
				for(int j=0; j<n; j++){
					mat[i][j] = getString();
				}
			}else{
				for(int j=n-1; j>=0; j--){
					mat[i][j] = getString();
				}
			}
			
			
			
		}
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
		

	}
	
	public static String getString(){
		String str =String.valueOf(count); 
		count++;
		if(count>90) count=65;
		
		return str;
		
	}

}
