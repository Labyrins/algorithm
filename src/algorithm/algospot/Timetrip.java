package algorithm.algospot;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Timetrip {

	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("algoinput/timetrip.txt"), 32768));
		
		int tc = sc.nextInt();
		
		int v, w, s, e;
		
		for(int i=0; i<tc; i++){
			v = sc.nextInt();
			w = sc.nextInt();
			int[][] map = new int[v][v];
			
			for(int j=0; j<w; j++){
				s = sc.nextInt();
				e = sc.nextInt();
				map[s][e] = sc.nextInt();
			}
			printMap(map, v);
			System.out.println();
			
		}
		sc.close();
	}
	
	public static void printMap(int[][] map, int size){
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}

//1 3
//-4 8
//0 INFINITY
//UNREACHABLE