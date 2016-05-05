package algorithm.basic;

import java.util.Scanner;

public class Decimal2Ntype {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n  = sc.nextInt();
		int type = sc.nextInt();
		sc.close();
		
		switch(type){
			case 2 :
				System.out.println(Integer.toBinaryString(n));
				break;
			case 8 : 
				System.out.println(Integer.toOctalString(n));
				break;
			case 16 : 
				System.out.println(Integer.toHexString(n).toUpperCase());
				break;
		}
	}

}
