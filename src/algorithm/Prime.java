package algorithm;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size > 100) {
			throw new Exception("input is over 100");
		}
		for(int i=0;i<size;i++){
			int center = sc.nextInt();
			int upperPrime = center;
			int lowerPrime = center;
			for(int j=center;j<1000000;j++){
				if(isPrime(j)){
					upperPrime = j;
					break;
				}
			}
			for(int k=center;k>0;k--){
				if(isPrime(k)){
					lowerPrime = k;
					break;
				}
			}
			int uDiffer = upperPrime - center;
			int lDiffer = center - lowerPrime;
			if(uDiffer>lDiffer){
				System.out.println(lowerPrime);
			}else if(uDiffer<lDiffer){
				System.out.println(upperPrime);
			}else {
				if(lowerPrime==upperPrime){
					System.out.println(center);
				}else{
					System.out.println(lowerPrime + " " + upperPrime);
				}
			}
			
		}

	}
	
	public static boolean isPrime(int n) {
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
