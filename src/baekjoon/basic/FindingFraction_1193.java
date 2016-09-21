package baekjoon.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class FindingFraction_1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        int a = Integer.parseInt(br.readLine());
        
        int sum = 0;
		int x = 1;
		int start, end;
		int gap = 0;
		
		while(sum<a){
			sum += x;
//			System.out.println(sum);
			x++;
//			System.out.println(x);
			if(sum>a){
				gap = x-1;
				start = sum-gap;
				System.out.println(start);
				System.out.println(gap);
			}
		}
        
	}

}
