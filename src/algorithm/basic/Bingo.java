/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=310
 */

package algorithm.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bingo {

	static int[][] map = new int[5][5];
	static int[][] check = new int[5][5];
	static int[] order = new int[25];
	
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("bingo.txt");
		Scanner sc = new Scanner(fs);
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<25; i++){
			order[i] = sc.nextInt();
			setNum(order[i]);
			if(checkBingo()){
				System.out.println(i+1);
				break;
			}
			
		}
		sc.close();
		
	}
	
	public static void setNum(int n){
		Loop1 : for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(map[i][j]==n){
					check[i][j] = 1;
					break Loop1;
				}
			}
		}
	}
	
	public static boolean checkBingo(){
		int bingoCount = 0;
		int h, v;
		for(int i=0; i<5; i++){
			h = 0;
			v = 0;
			for(int j=0; j<5; j++){
				if(check[i][j]==1) h++;
				if(check[j][i]==1) v++;
			}
			if(h==5) bingoCount++;
			if(v==5) bingoCount++;
		}
		
		h = 0;
		v = 0;
		for(int i=0; i<5;i++){
			if(check[i][i]==1) h++;
			if(check[i][4-i]==1) v++;
		}
		if(h==5) bingoCount++;
		if(v==5) bingoCount++;
		
		return (bingoCount>=3)?true:false;
	}

}
