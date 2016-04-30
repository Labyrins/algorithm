/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=980&sca=2010
 */

package algorithm.basic;

import java.util.Scanner;

public class SnailSquare {

	static int n;
	static int[][] map;
	static int x=1;
 	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		map = new int[n][n];
		
		int count = 0;
		if(n%2==0){
			count = n/2;
		}else{
			count = (n/2)+1;
		}
		
		int si = 0;
		int sj = 0;
		int ei = n;
		int ej = n;
		
		for(int k=0;k<count;k++){
			
			for(int j=sj;j<ej;j++){
				map[si][j] = x;
				x++;
			}
			
			for(int i=si+1;i<ei;i++){
				map[i][ej-1] = x;
				x++;
			}
			
			for(int j=ej-2;j>=sj;j--){
				map[ei-1][j]=x;
				x++;
			}
			
			for(int i=ei-2;i>si;i--){
				map[i][sj]=x;
				x++;
			}
			
			si++;
			sj++;
			ei--;
			ej--;
		}
		
		printMap();
		
	}
	
	public static void printMap(){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}
