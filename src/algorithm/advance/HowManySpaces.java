package algorithm.advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HowManySpaces {
	
	static int n, m;
	static int[][] map;
	static int[][] visit;
	static ArrayList<Integer> resultSet = new ArrayList<Integer>();
	
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("howmanyspaces_input.txt");
		Scanner sc = new Scanner(in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		visit = new int[n][m];
		
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				map[i][j] = 0;
				visit[i][j] = 0;
			}
		}
		int sq = sc.nextInt();
		int sn, sm, en, em; 
		
		for(int k=0; k<sq; k++){
			sn = sc.nextInt();
			sm = sc.nextInt();
			en = sc.nextInt();
			em = sc.nextInt();
			for(int i=sn;i<en;i++){
				for(int j=sm;j<em;j++){
					map[j][i] = 1;
				}
			}
			
		}
		sc.close();
		
		
		while(countzero()!=0){
			move(getzero());
		}
		
		
		Collections.sort(resultSet);
		System.out.println(resultSet.size());
		
		for(int i=0; i<resultSet.size(); i++){
			System.out.print(resultSet.get(i)+" ");
		}
		
		
	}
	
	public static int[] getzero(){
		
		int[] a = new int[2];
		Loop1 : for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(map[i][j]==0){
					a[0] = j;
					a[1] = i;
					break Loop1;
				}
			}
		}
		return a;
	}
	
	public static int countzero(){
		int c =0;
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(map[i][j]==0){
					c++;
				}
			}
		}
		return c;
	}
	
	public static void move(int[] a){
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		ArrayList<int[]> tempArray;
		deque.add(a);
		int space = 0;
		int[] temp = new int[2];
		while(!deque.isEmpty()){
			temp = deque.poll();
			space++;
			map[temp[1]][temp[0]] = 2;
			tempArray = get4WayPosition(temp[0], temp[1]);
			
			if(!tempArray.isEmpty()){
				for(int i=0; i<tempArray.size(); i++){
					deque.add(tempArray.get(i));
				}
			}
		}
		resultSet.add(space);
	}
	
	public static ArrayList<int[]> get4WayPosition(int x, int y){
		
		ArrayList<int[]> fourway = new ArrayList<int[]>();
		int[] temp;
		
		if(x+1<m){
			temp = new int[2];
			temp[0] = x+1;
			temp[1] = y;
			if(map[temp[1]][temp[0]]==0 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(y+1<n){
			temp = new int[2];
			temp[0] = x;
			temp[1] = y+1;
			if(map[temp[1]][temp[0]]==0 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(x-1>=0){
			temp = new int[2];
			temp[0] = x-1;
			temp[1] = y;
			if(map[temp[1]][temp[0]]==0 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(y-1>=0){
			temp = new int[2];
			temp[0] = x;
			temp[1] = y-1;
			if(map[temp[1]][temp[0]]==0 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		
		return fourway;
	}
	
//	public static void printMap(){
//		for(int i=0; i<n; i++){
//			for(int j=0; j<m; j++){
//				System.out.print(map[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	

}
