package algorithm.algospot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {
	
	static long[] A;
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("algoinput/runningmedian.txt");
		Scanner sc = new Scanner(in);
		int C = sc.nextInt();
		int N, a, b;
		long total = 1983;
		
//		PriorityQueue<Long> Q =	new PriorityQueue<Long>();
		for(int t=0;t<C;t++){
			N = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			A = new long[N];
			ArrayList<Long> list = new ArrayList<>();
			A[0] = 1983;
			list.add(A[0]);
			for(int i=1;i<N;i++){
				A[i] = (A[i-1] * a + b) % 20090711;
//				System.out.println(A[i]);
				list.add(A[i]);
				Collections.sort(list, new sort());
				if(i/2==0){
//					System.out.print(A[i/2]+" ");
					total += list.get(i/2);
				}else{
//					System.out.print(A[i/2+1]+" ");
					total += list.get((i/2)+1);
				}
				
			}
			System.out.println(total%20090711);
			total = 1983;
			
		}
		sc.close();
	}

}

class sort implements Comparator<Long>{

	@Override
	public int compare(Long o1, Long o2) {
		// TODO Auto-generated method stub
		return (int) (o1-o2);
	}

	
}

