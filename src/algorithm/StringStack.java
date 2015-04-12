package algorithm;

import java.util.Scanner;

public class StringStack {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		if (size > 100) {
			throw new Exception("input is over 100");
		}

		String stack = "";
		String tempString = "";
		String tempValue = "";

		for (int i = 0; i < size; i++) {
			System.out.println("\t current stack :" + stack);
			tempString = sc.next();
			if (tempString.equals("i")) {
				tempValue = sc.next();
				if (stack.length() != 0) {
					stack += ";" + tempValue;
				} else {
					stack += tempValue;
				}
			}
			if (tempString.equals("o")) {
				if (stack.length() == 0) {
					System.out.println("empty");
				} else {
					int index = stack.lastIndexOf(';');
					int stacklength = stack.length();
					String peek = stack.substring(index+1, stacklength);
					System.out.println(peek);
					stack = stack.substring(0, index);
				}
			}
			if (tempString.equals("c")) {
				String[] array = stack.split(";");
				int arraylength = array.length;
				System.out.println(arraylength);
			}
		}

	}
}
