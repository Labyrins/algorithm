package baekjoon.basic;

import java.io.*;

class Beehive_2292 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        long a = Long.parseLong(br.readLine());
        
		int n = 1;
		int x = 1;
		while(n<a){
			n += x*6;
			x++;
		}
		System.out.println(x);
		
	}

}
