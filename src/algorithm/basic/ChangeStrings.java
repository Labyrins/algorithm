/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=1779
 */

package algorithm.basic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChangeStrings {

	public static void main(String[] args) throws FileNotFoundException  {
		Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream("basic/changestrings.txt"), 32768));

		int n = sc.nextInt();
		String[][] change = new String[n][2];
		for(int i=0; i<n; i++){
			change[i][0] = sc.next();
			change[i][1] = sc.next();
		}
		int m = sc.nextInt();
		
		String temp;
		for(int i=0; i<m; i++){
			temp = sc.next();
			for(int j=0;j<n; j++){
				if(change[j][0].equals(temp)){
					temp = change[j][1];
				}
			}
			System.out.print(temp);
		}
		sc.close();
	}

}
