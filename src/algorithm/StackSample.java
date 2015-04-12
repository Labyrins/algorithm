package algorithm;

import java.util.Stack;
import java.util.Scanner;

public class StackSample {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		if (size > 100) {
			throw new Exception("input is over 100");
		}

		Stack<String> stack = new Stack<String>();
		String tempString = "";
		String tempValue = "";

		for (int i = 0; i < size; i++) {
			tempString = sc.next();
			if (tempString.equals("i")) {
				tempValue = sc.next();
				stack.push(tempValue);
			}
			if (tempString.equals("o")) {
				if (stack.size() == 0) {
					System.out.println("empty");
				} else {
					System.out.println(stack.peek());
					stack.pop();
				}
			}
			if (tempString.equals("c")) {
				System.out.println(stack.size());
			}
		}

	}
}