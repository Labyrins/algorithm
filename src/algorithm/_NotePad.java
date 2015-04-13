package algorithm;

public class _NotePad {

	public static void main(String[] args) {
		int ascii = (int) 'A';
		
		System.out.println(ascii);
	}
	
	public static boolean isPrime(int n) {

        int divisor = 2;
        
        while(n>divisor){
            if(n%divisor==0){
                return false;
            }else{
                divisor++;
            }
        }
        return true;
    }
}
