package algorithm;

import java.util.Scanner;

public class BaseBall {



/*
#input
1234
6
4321
6784
1290
4567
3408
1234

#output
04
10
20
01
02
success
 */
	public static void main(String[] args) throws Exception {
		int strike = 0; // 정답 변수 선언
		int ball = 0; // 정답 변수 선언
		Scanner s = new Scanner(System.in);
		
		int target[] = new int[4]; // 네자리 숫자 세팅 
		String value = s.next();
		for(int i=0; i<4; i++){
			target[i] = value.charAt(i);
		}// 처음 읽은 네자리 숫자 하나씩 배열에 넣어준다.
		
		int testCase = s.nextInt(); //테스트케이스 갯수
		
		String testSet[] = new String[testCase]; //테스트 셋을 String 형태의 배열로 쥐고 있는다.
		for(int a=0; a<testCase; a++){
			testSet[a] = s.next();
		}
		
		for(int x=0; x<testCase; x++){ //테스트 케이스를 하나씩 돌
			
			int test[] = new int[4]; // 스트라익과 볼을 판단하기 위한 배열 선언
			for(int y=0; y<4; y++){ //4자리짜리 for문을 하나 돌려서...
				test[y] = testSet[x].charAt(y); //testSet의 스트링을 int형 배열로 선언한다.
			}
			

			for (int i = 0; i < 4; i++) { // strike, ball 여부 체크
				for (int j = 0; j < 4; j++) {
					if (target[i] == test[j]) {
						if (i == j) {
							strike = strike + 1;
						} else {
							ball = ball + 1;
						} // strike, ball 값 갱신
					}
				}
			}

			if (strike == 0 && ball == 0) { // 모두 틀릴 경우
				System.out.println("00");
			} else if (strike == 4) { // 정답일 경우
				System.out.println("success");
			} else { // 부분 정답일 경우
				System.out.println(strike + "" + ball); //문제에서 원하는 답의 형태로 수정 필
				
				//스트라이크가 볼 초기
				strike = 0; 
				ball = 0;
			}
		}
		
		

	}

}
