package algorithm;

import java.util.Scanner;


public class SelectSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int array[] = new int[input];
        
        for(int i=0; i<input; i++){
            array[i] = sc.nextInt();
        }
        int tempA, tempB;
        for(int y=input; y>0; y--){
        	int min = array[input-y];
	        for(int i=input-y+1; i<input; i++){
	            if(min>=array[i]){
	            	tempA = array[input-y+1];
	            	tempB = array[i];
	            	array[input-y+1] = tempB;
	            	array[i] = tempA;
	            }
	            
	        }
	        for(int x=0; x<input; x++){
	        	System.out.print(array[x]+ " ");
	        }
	        System.out.println();
	        
        }

        System.out.println();

    }

}
