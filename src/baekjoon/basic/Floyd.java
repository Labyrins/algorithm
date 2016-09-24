package baekjoon.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Floyd {

	static int n, l;
	static int[][] map, cost;
	static int INF = 9999999;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		cost = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0;j<n;j++){
				if(i!=j) cost[i][j] = INF;
			}
		}
		l = Integer.parseInt(br.readLine());
		for(int i=0;i<l;i++){
			String[] input = (br.readLine()).split(" ");
			int x = Integer.parseInt(input[0])-1;
			int y = Integer.parseInt(input[1])-1;
			int value = Integer.parseInt(input[2]);
			if(cost[x][y]==0){
				cost[x][y] = value;
			}else{
				cost[x][y] = (value<cost[x][y]) ? value : cost[x][y];
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0;j<n;j++){
				for(int k=0; k<n; k++){
	                if(cost[j][k] > cost[j][i] + cost[i][k]){
	                	cost[j][k] = cost[j][i] + cost[i][k];
	                }
	            }
			}
		}
		printMap(cost);
	}
	
	private static void printMap(int[][] pmap){
		for(int i=0; i<n; i++){
			for(int j=0;j<n;j++){
				System.out.print(pmap[i][j]+" ");
			}
			System.out.println();
		}
	}

}


//5
//14
//1 2 2
//1 3 3
//1 4 1
//1 5 10
//2 4 2
//3 4 1
//3 5 1
//4 5 3
//3 5 10
//3 1 8
//1 4 2
//5 1 7
//3 4 2
//5 2 4