/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=992
 */

package algorithm.basic;

import java.util.Scanner;

public class StarTriangle2 {

static int n, m;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		
		if(n<=100 && n>0 && n%2==1 && m>0 && m<5){
			n = ((n-1)/2)+1;
			print();
		}else{
			System.out.println("INPUT ERROR!");
		}
		
	}
	
	public static void print(){
		switch(m){
		case 1 :
			for(int i=1; i<=n; i++){
				for(int k=0;k<i;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n-1; i>0; i--){
				for(int j=i; j>0; j--){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		
		case 2 :
			for(int i=1; i<=n; i++){
				for(int j=n;j>i;j--){
					System.out.print(" ");
				}
				for(int k=0;k<i;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n-1; i>0; i--){
				for(int j=0;j<n-i;j++){
					System.out.print(" ");
				}
				for(int j=i; j>0; j--){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
			
		case 3 :
			for(int i=n;i>1;i--){
				for(int j=0;j<n-i;j++){
					System.out.print(" ");
				}
				for(int k=(i*2)-1; k>0; k--){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1; i<=n; i++){
				for(int j=n;j>i;j--){
					System.out.print(" ");
				}
				for(int k=0;k<(i*2)-1;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		
		case 4 :
			for(int i=n;i>1;i--){
				for(int j=0;j<n-i;j++){
					System.out.print(" ");
				}
				for(int k=i; k>0; k--){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1; i<=n; i++){
				for(int j=0;j<n-1; j++){
					System.out.print(" ");
				}
				for(int k=0;k<i;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		

			
		}
	}

}