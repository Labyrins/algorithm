/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=712
 */

package algorithm.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ColorPaper {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream in = new FileInputStream("basic/colorpaper.txt");
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();
		
		int[][] map = new int[100][100];
		int[][] paper = new int[n][2];
		
		for(int i=0; i<n; i++){
			paper[i][0] = sc.nextInt();
			paper[i][1] = sc.nextInt();
		}
		sc.close();

		
		int x,y;
		int result = 0;
		for(int i=0; i<n; i++){
			x = paper[i][0]-1;
			y = paper[i][1]-1;
			for(int j=x;j<x+10;j++){
				for(int k=y;k<y+10;k++){
					if(map[j][k]==0){
						map[j][k] = 1;
						result++;
					}
				}
			}
		}

		System.out.println(result);
		
	}

}
