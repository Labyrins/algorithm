package algorithm;

import java.util.Scanner;

public class PrimeString {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		int inputLength = input.length();
		int[] primeTable = new int[26];
		for(int x=0; x<26; x++){
			primeTable[x]=0;
		} //initial PrimeTable
		for(int i=0; i<inputLength; i++){
			int ascii = ((int) input.charAt(i))-65;
			primeTable[ascii] += 1;
		}
		String result = "";
		for(int j=0; j<primeTable.length;j++){
			
			int tempInt = primeTable[j];
			if(isPrime(tempInt)){
				result += (char)(j+65);
			}
		}
		if(result==""){
			System.out.println("NONE");
		}else{
			System.out.println(result);
		}
	}
	
	public static boolean isPrime(int n) {
		if(n==1) return true;
		if(n==2) return true;
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
