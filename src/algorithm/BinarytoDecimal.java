package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/*
 *   
 *   10진수 입력 -> 2진수 변환 -> reverse -> 10진수 변환해서 출력
  
  그리고 2번은
  수도쿠
  스도쿠?
  9*9 에서 잘못된 숫자를 찾아서 고치기
  뭔지 잘 모르겠어
 */

public class BinarytoDecimal {

    public static void main(String[] args) throws Exception {
        BufferedReader decimalInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Decimal value:");
        int decimal = Integer.parseInt(decimalInput.readLine());
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value is : "+ binary);
        String reverseBinary = "";
        for(int i=0; i<binary.length(); i++){
            reverseBinary = binary.charAt(i) + reverseBinary;
        }
        System.out.println("Reversed Binary value is : "+ reverseBinary);
        System.out.println("Decimal value is : " + Integer.parseInt(reverseBinary,2));
    }
}
