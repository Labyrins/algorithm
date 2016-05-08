/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=795
 */

package algorithm.basic;

import java.util.Scanner;

public class StarTriangle1 {
	
	static int n, m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		if(n<=100 && n>0 && m>0 && m<4){
			print();
		}else{
			System.out.println("INPUT ERROR!");
		}
		
		

	}
	
	public static void print(){
		switch(m){
		case 1 :
			for(int i=0;i<n;i++){
				for(int j=0; j<=i;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		
		case 2 :
			for(int i=0;i<n;i++){
				for(int j=i; j<n;j++){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 3 :
			String str = "*";
			for(int i=0;i<n;i++){
				for(int j=i+1; j<n;j++){
					System.out.print(" ");
				}
				System.out.println(str);
				str += "**";
			}
			break;
		

			
		}
	}

}
