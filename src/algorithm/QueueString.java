package algorithm;

import java.util.Scanner;

public class QueueString {
	
	
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		if (size > 100) {
			throw new Exception("input is over 100");
		}
		
		
		String queue = "";
		String tempString = "";
		String tempValue = "";

		for (int i = 0; i < size; i++) {
			tempString = sc.next();
			if (tempString.equals("i")) {
				tempValue = sc.next();
				queue += tempValue +",";
			}
			if (tempString.equals("o")) {
				if (queue.indexOf(",")==-1) {
					System.out.println("empty");
				} else {
					int index = queue.indexOf(",");
					String dequeuedData = queue.substring(0, index);
					System.out.println(dequeuedData);
					queue = queue.substring(index+1, queue.length());
				}
			}
			if (tempString.equals("c")) {
				if (queue.indexOf(",")==-1) {
					System.out.println("0");
				} else {
					String array[] = queue.split(",");
					System.out.println(array.length);
				}
			}
		}
	}

}
