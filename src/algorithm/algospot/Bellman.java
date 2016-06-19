package algorithm.algospot;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bellman {

	static ArrayList<int[]> V = new ArrayList<>();
	static int[] temp;
	static int[] d;
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args)  throws FileNotFoundException {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("algoinput/bellman.txt"), 32768));
		int n = sc.nextInt();
		d = new int[n];
		for(int i=0; i<n;i++){
			temp = new int[3];
			temp[0] = sc.nextInt();
			temp[1] = sc.nextInt();
			temp[2] = sc.nextInt();
			V.add(temp);
			if(i==0){
				d[i] = 0;
			}else{
				d[i] = INF;
			}
		}
		sc.close();
		
		boolean update = true;
		
		while(update){
			update=false;
			for(int i=0; i<n; i++){
				for(int j=0; j<V.size(); j++){
					int u = V.get(j)[0];
					int v = V.get(j)[1];
					int cost = V.get(j)[2];
					if(d[u]+cost <d[v]){
						d[v] = d[u]+cost;
						update = true;
						System.out.println("d["+v+"] = "+d[v]);
					}
				}
			}
		}
		System.out.println(d[3]);
		
		
	}

}
