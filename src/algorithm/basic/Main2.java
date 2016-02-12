package algorithm.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[];
		a = new int[10000];
		
		int index=0;
		while(sc.hasNext()){
			int a0 = sc.nextInt();
			a[index] = a0;
			if(a0>=100){
				break;
			}else{
				index++;
			}
			
		}
		int sum=0;
		for(int i=index;i>=0;i--){
			sum += a[i];
		}
		System.out.println(sum);
		
		double av = sum/(double)(index+1);
//		System.out.println(av);
		System.out.printf("%.1f", av);

						
	}

}
 



// 소수점 두번째 자리 반올림 System.out.printf("%.2f",y);

