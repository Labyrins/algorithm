package algorithm;

import java.util.Scanner;


public class SelectSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int array[] = new int[input];

        for(int i = 0; i < input; i++) {
            array[i] = sc.nextInt();
        }
        int indexMin, temp;
        for(int i = 0; i < input - 1; i++) {
            indexMin = i;
            for(int j = i + 1; j < input; j++) {
                // 선택원소 보다 작은 원소위치 찾기
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            temp = array[indexMin]; // 최소값 임시 저장
            array[indexMin] = array[i]; // 최소값 위치에 선택위치의 원소와 교환
            array[i] = temp; // 선택위치에 최소값 교환
            for(int x = 0; x < input; x++) {
                System.out.print(array[x] + " ");
            }
            System.out.println();
        }

        
    }

}
