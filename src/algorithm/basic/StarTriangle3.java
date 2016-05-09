/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=608
 */

package algorithm.basic;

import java.util.Scanner;

public class StarTriangle3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp = sc.nextInt();
		
		sc.close();
		
		if(temp<=100 && temp>0 && temp%2==1){
			int n = ((temp-1)/2)+1;
			for(int i=1; i<=n; i++){
				for(int j=1; j<i;j++){
					System.out.print(" ");
				}
				for(int k=0;k<(i*2)-1;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=n-1; i>0; i--){
				for(int k=i-1; k>0; k--){
					System.out.print(" ");
				}
				for(int j=(i*2)-1; j>0; j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}else{
			System.out.println("INPUT ERROR!");
		}
	}

}



//*
// ***
//  *****
//   *******
//  *****
// ***
//*