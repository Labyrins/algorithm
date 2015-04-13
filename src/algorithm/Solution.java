package algorithm;

import java.util.Scanner;


/*
 * 사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다. 이러한 상황에서도 동일하게 java Solution 명령으로
 * 프로그램을 수행해볼 수 있습니다.
 */
class Solution {

    static int N;

    static int AnswerN;

    public static void main(String args[]) throws Exception {

        /*
         * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를 테스트 할 때, 편의를
         * 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수
         * 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다. 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를
         * 지우거나 주석 처리 하셔야 합니다.
         */
        // System.setIn(new FileInputStream("res/sample_input.txt"));

        
        /*
         * input 
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25


         */
        /*
         * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
         */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        System.out.print("\n");

        int[][] map = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int tmp = sc.nextInt();
                map[i][j] = tmp;
                System.out.print(map[i][j] + " ");
            }
            System.out.print("\n");
        }
        
        
        for(int x=0; x<N;x++){
           for(int y=0;y<N;y++){
               int center = map[x][y];
               System.out.print("("+x+","+y+")");
               //범위(x>=0 && x<N)
               //상(x-1,y)
               if(x-1>=0){
                   System.out.print("상");
                   AnswerN += Math.abs(center-map[x-1][y]);
               }
               //하(x+1,y)
               if(x+1<N){
                   System.out.print("하");
                   AnswerN += Math.abs(center-map[x+1][y]);
               }
               //좌(x,y-1)
               if(y-1>=0){
                   System.out.print("좌");
                   AnswerN += Math.abs(center-map[x][y-1]);
               }
               //우(x,y+1)
               if(y+1<N){
                   System.out.print("우");
                   AnswerN += Math.abs(center-map[x][y+1]);
               }
               System.out.println();
           }
        }
        
        
        System.out.println("AnswerN : " + AnswerN);

        // int[][] sample = new int[5][5];
        //
        // for(int x=0; x )
        // System.out.println("#"+test_case+" "+AnswerN);
    }
}
