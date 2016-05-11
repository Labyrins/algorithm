/*
 * http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=522
 */

package algorithm.basic;

import java.util.Scanner;

public class SecretLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String letter = sc.next();
		sc.close();
		String[] value  = new String[n];
		String temp;
		for(int i=0;i<n;i++){
			temp = "";
			for(int j=i*6;j<(i+1)*6;j++){
				temp += letter.charAt(j);
			}
			value[i] = temp;
		}
		
		String[] index = new String[8];
		index[0] = "000000";
		index[1] = "001111";
		index[2] = "010011";
		index[3] = "011100";
		index[4] = "100110";
		index[5] = "101001";
		index[6] = "110101";
		index[7] = "111010";
		
		String result="";
		Loop1 : for(int i=0; i<value.length;i++){
			switch(value[i]){
				case "000000" : 
					result += "A";
					break;
				case "001111" : 
					result += "B";
					break;
				case "010011" : 
					result += "C";
					break;
				case "011100" : 
					result += "D";
					break;
				case "100110" : 
					result += "E";
					break;
				case "101001" : 
					result += "F";
					break;
				case "110101" : 
					result += "G";
					break;
				case "111010" : 
					result += "H";
					break;
				
				default:
					result = i+1+"";
					break Loop1;
			}
		}

		System.out.println(result);
		
		
	}
	
	

}

//5
//111010 111101 101001 100100 011100
//HGFED
// A 000000
// B 001111
// C 010011
// D 011100
// E 100110
// F 101001
// G 110101
// H 111010

//
//3
//001111000000011100
//
//BAD
//
//
//
//5
//011111000000111111000000111111
//
//3