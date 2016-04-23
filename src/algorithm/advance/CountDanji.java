/**
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=729&sca=3030
 * @author labyrins
 */

package algorithm.advance;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountDanji {

	static int n;
	static int[][] map;
	static int[][] visit;
	static ArrayList<Integer> resultSet = new ArrayList<Integer>();
	
	public static void main(String[] args)  throws FileNotFoundException {
		
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("countdanji_input.txt"), 32768));
		n = sc.nextInt();
		map = new int[n][n];
		visit = new int[n][n];

		for(int i=0; i<n; i++){
			String ss = sc.next();
			for(int j=0; j<n; j++){
				map[i][j] = Integer.parseInt(Character.toString(ss.charAt(j)));
				visit[i][j] =0;
			}
		}
		sc.close();
		
		while(countOne()!=0){
			move(getOne());
		}
		
//		printMap();
		
		Collections.sort(resultSet);
		System.out.println(resultSet.size());
		
		for(int i=0; i<resultSet.size(); i++){
			System.out.println(resultSet.get(i));
		}
		
		
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
		
		if(x+1<n){
			temp = new int[2];
			temp[0] = x+1;
			temp[1] = y;
			if(map[temp[1]][temp[0]]==1 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(y+1<n){
			temp = new int[2];
			temp[0] = x;
			temp[1] = y+1;
			if(map[temp[1]][temp[0]]==1 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(x-1>=0){
			temp = new int[2];
			temp[0] = x-1;
			temp[1] = y;
			if(map[temp[1]][temp[0]]==1 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		if(y-1>=0){
			temp = new int[2];
			temp[0] = x;
			temp[1] = y-1;
			if(map[temp[1]][temp[0]]==1 && visit[temp[1]][temp[0]]==0){
				fourway.add(temp);
				visit[temp[1]][temp[0]]=1;
			}
		}
		return fourway;
	}
	
	public static int countOne(){
		int c =0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(map[i][j]==1){
					c++;
				}
			}
		}
		return c;
	}
	

	public static int[] getOne(){
		
		int[] a = new int[2];
		Loop1 : for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(map[i][j]==1){
					a[0] = j;
					a[1] = i;
					break Loop1;
				}
			}
		}
		return a;
	}
	
	public static void printMap(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}

}
