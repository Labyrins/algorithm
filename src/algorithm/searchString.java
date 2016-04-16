package algorithm;

import java.util.Scanner;

public class searchString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String word = "";
		int KOIcount = 0;
		int IOIcount = 0;
		for(int i=0; i<input.length()-2; i++){
			word = ""+input.charAt(i)+input.charAt(i+1)+input.charAt(i+2);
			if(word.equalsIgnoreCase("KOI")){
				KOIcount++;
			}
		}
		for(int i=0; i<input.length()-2; i++){
			word = ""+input.charAt(i)+input.charAt(i+1)+input.charAt(i+2);
			if(word.equalsIgnoreCase("IOI")){
				IOIcount++;
			}
		}
		System.out.println(KOIcount);
		System.out.println(IOIcount);
	}

}
