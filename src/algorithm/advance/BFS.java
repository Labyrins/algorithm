package algorithm.advance;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BFS {
	
	static ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
	static int[] visited = new int[6];
	static int[][] map = new int[6][6];
	
	public static void main(String[] args) {
		
		
//		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				map[i][j] = sc.nextInt();
			}
			visited[i] = 0;
		}
		
		bfs(0);
		
	}
	
	public static void bfs(int node){
		deque.add(node);
		visited[node] = 1;
		int index = 0;
		
		while(!deque.isEmpty()){
			index = deque.poll();
			for(int i=0; i<6; i++){
				if(map[index][i]!=0 && visited[i]!=1){
					visited[i] = 1;
					deque.add(i);
				}
			}
			printNode(index);
			
		}
		
	}
	
	public static void printNode(int node){
		System.out.println(node + 1);
	}
}

//1 - 5,6
//2 - 3,4,6
//3 - 2,4,5
//4 - 2,3
//5 - 1,3,6
//6 - 1,2,5

//0 0 0 0 1 1
//0 0 1 0 0 1
//0 1 0 1 1 0
//0 1 1 0 0 0
//1 0 1 0 0 1
//1 1 0 0 1 0

