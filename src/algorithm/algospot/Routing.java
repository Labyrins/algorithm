/*
 * https://algospot.com/judge/problem/read/ROUTING
 */

package algorithm.algospot;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Routing {
	
	static float[][] map;
	static int T, n, line;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("algoinput/routing.txt"), 32768));
		T = sc.nextInt();
		float tempf;
		int tempx, tempy;
		
		for(int i=0; i<T; i++){
			n = sc.nextInt();
			line = sc.nextInt();
			map = new float[n][n];
			for(int j=0;j<line;j++){
				tempx = sc.nextInt();
				tempy = sc.nextInt();
				tempf = sc.nextFloat();
				if(map[tempx][tempy]==0.0 || tempf<map[tempx][tempy]){
					map[tempx][tempy] = tempf;
					map[tempy][tempx] = tempf;
				}
			}
			ArrayDeque<Float> deq = new ArrayDeque<>();
			
			
			printMap();
			
		}
		sc.close();
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
