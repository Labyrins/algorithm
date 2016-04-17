package algorithm.advance;

import java.util.Scanner;

public class NQueen {
	
	static int[][] map;
	static int n;
	static int count=0;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		map = new int[n][n];
		
		initMap();
		
		movePosition(1, 3);
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void setQueen(int n, int r){
		
	}
	
	public static void movePosition(int x, int y){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i!=x && j!=y && i-j!=x-y && i+j!=x+y){
					map[i][j]=1;
				}
			}
		}
	}
	
	public static boolean checkPosition(int x, int y, int bx, int by){
		if(x==bx || y==by || x-y==bx-by || x+y==bx+by){
			return false;
		}		
		return true;
	}
	
	public static void initMap(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				map[i][j] = 0;
			}
		}
	}
	
	

}
