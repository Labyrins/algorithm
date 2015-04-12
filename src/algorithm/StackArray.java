package algorithm;

import java.util.Scanner;

public class StackArray {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		if (size > 100) {
			throw new Exception("input is over 100");
		}

		String[] stack = {};
		String nextInput = "";
		String tempValue = "";

		for (int i = 0; i < size; i++) {
			nextInput = sc.next();
			if (nextInput.equals("i")) {
				tempValue = sc.next();
				int stacklength = stack.length;
				stack[stacklength] = tempValue; //push
			}
			if (nextInput.equals("o")) {
				if (stack.length == 0) {
					System.out.println("empty");
				} else {
					System.out.println(stack[stack.length]);
					String[] tempStack = {};
					for(int x=0;x<stack.length-1;x++){
						tempStack[x] = stack[x];
					}
					stack = tempStack;
				}
			}
			if (nextInput.equals("c")) {
				System.out.println(stack.length);
			}
		}

	}

}
