package algorithm;

import java.util.Scanner;


public class BinaryToDecimal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        System.out.println(Integer.valueOf(binary, 2));

    }

}
