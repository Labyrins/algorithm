package algorithm.basic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int big;
		int small;
		
		if(a>=b){
			big = a;
			small = b;
		}else{
			big = b;
			small = a;
		}
		
		int sum=0;
		int index=0;
		double av;
		
		for(int i=small;i<=big;i++){
			if((i%3)==0 || (i%5)==0){
				sum+=i;
				index++;
			}
		}
		
		
		System.out.println("합계 : "+sum);
		System.out.print("평균 : ");
		System.out.printf("%.1f",sum/(double)index);

	}

}

// 소수점 두번째 자리 반올림 System.out.printf("%.2f",y);
