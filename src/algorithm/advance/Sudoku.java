package algorithm.advance;

/**
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1097&sca=3030
 * @author hongsikalexlee
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {

	static int[][] map = new int[9][9];
	static int zeroCount = 0;

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream in = new FileInputStream("sudoku_input.txt");
		Scanner sc = new Scanner(in);

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
//				System.out.print(map[i][j] + " ");
			}
//			System.out.println();
		}
		sc.close();
//		System.out.println(count0FromMap());

		int checkPostionInLine;
		int[] vlist = new int[9];
		int[] blist = new int[9];

		zeroCount = count0FromMap();

		while (zeroCount > 0) {

			// 가로줄 확인 로직.
			for (int i = 0; i < 9; i++) {
				checkPostionInLine = isOne(map[i]);
				if (checkPostionInLine != 0) {
					fillOneNumInLine(map[i], i, checkPostionInLine-1);
				}
			}
			// print();

			// 세로줄 확인 로직.
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					vlist[j] = map[j][i];
				}
				checkPostionInLine = isOne(vlist);
				if (checkPostionInLine != 0) {
					fillOneNumInLine(vlist, checkPostionInLine-1, i);
				}

			}

			// print();

			// fill one num by block
			for (int i = 1; i < 9; i += 3) {
				for (int j = 1; j < 9; j += 3) {
					int index = 0;
					for (int k = -1; k < 2; k++) {
						for (int w = -1; w < 2; w++) {
							blist[index] = map[i + k][j + w];
							index++;
						}
					}
					checkPostionInLine = isOne(blist);
					if (checkPostionInLine != 0) {
						fillOneNumInBlock(blist, i, j, checkPostionInLine);
					}
				}
			}
			zeroCount = count0FromMap();
		}
		print();

	}

	public static int count0FromMap() {
		int result = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (map[i][j] == 0)
					result++;
			}
		}
		return result;
	}

	public static void fillOneNumInLine(int[] num, int x, int y) {
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += num[i];
		}
		int answer = 45 - sum;

//		if(x==7 && y==8 && zeroCount==4){
//			for(int i=0; i<9; i++){
//				System.out.print(num[i]+",");
//			}
//			System.out.println(answer);
//		}
		
		changeData(x,y,answer);

	}

	public static void fillOneNumInBlock(int[] num, int x, int y, int p) {
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += num[i];
		}
		int answer = 45 - sum;

		int ax=0;
		int ay=0;

		switch (p) {
		case 1:
			ax = x+1;
			ay = y+1;
			break;
		case 2:
			ax = x;
			ay = y+1;
			break;
		case 3:
			ax = x-1;
			ay = y+1;
			break;
		case 4:
			ax = x+1;
			ay = y;
			break;
		case 5:
			ax = x;
			ay = y;
			break;
		case 6:
			ax = x-1;
			ay = y;
			break;
		case 7:
			ax = x+1;
			ay = y-1;
			break;
		case 8:
			ax = x;
			ay = y-1;
			break;
		case 9:
			ax = x-1;
			ay = y-1;
			break;

		}
		
		changeData(ax, ay, answer);

	}

	// return that int[] has only one '0'
	// if return, it will be 0 or 1~9
	public static int isOne(int[] num) {
		int num0 = 0;
		int result = 0;
		for (int i = 0; i < 9; i++) {
			if (num[i] == 0) {
				result = i + 1;
				num0++;
			}
		}

		if (num0 == 1) {
			return result;
		} else {
			return 0;
		}
	}

	public static void print() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void changeData(int x, int y, int v){
		map[x][y] = v;
	}

}
