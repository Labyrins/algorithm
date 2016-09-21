package baekjoon.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;

public class 케빈베이컨의6단계법칙 {
	
	static ArrayDeque<Integer> deque;
	static int[] visited;
	static int[][] map;
	static int n, r;
	static int result;
	static HashMap<Integer , Integer> tree;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        r = Integer.parseInt(input[1]);
        map = new int[n][n];
        
        for(int i=0; i<r; i++){
        	input = br.readLine().split(" ");
        	map[Integer.parseInt(input[0])-1][Integer.parseInt(input[1])-1] = 1;
        	map[Integer.parseInt(input[1])-1][Integer.parseInt(input[0])-1] = 1;
        }
        for(int i=0;i<n;i++){
        	System.out.println(bfs(i));
        }
        
        printmap();

	}
	
	
	public static int bfs(int node){
		
		deque = new ArrayDeque<Integer>();
		visited = new int[n];
		tree = new HashMap<Integer , Integer>();
		
		int sum =0;
		int index = 0;
		int depth = 1;
		
		deque.add(node);
		visited[node] = 1;
		
		
		while(!deque.isEmpty()){
			index = deque.poll();
			for(int i=0; i<n; i++){
				if(map[index][i]!=0 && visited[i]==0){
					tree.put(i, getDepth(index));
					visited[i] = depth;
					deque.add(i);
				}
			}
//			System.out.print(index+1+" ");
			
		}
		for(int i=0;i<n;i++){
			if(i!=node){
				sum += visited[i];
			}
			System.out.print(tree.get(i));
		}
		
		return sum;
		
	}
	
	public static int getDepth(int a){
		
		if(tree.size()==0){
			return 0;
		}else{
			System.out.println(tree.get(a));
			return tree.get(a)+1;
		}
		
	}
	
	public static void printmap(){
		for(int i=0; i<n; i++){
        	for(int j=0;j<n;j++){
        		System.out.print(map[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}

//7 7
//1 3
//1 4
//4 5
//4 3
//3 2
//2 6
//5 7


//0 0 1 1 0 
//0 0 1 0 0 
//1 1 0 1 0 
//1 0 1 0 1 
//0 0 0 1 0 