package algorithm.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Omok {

	static int[][] map = new int[19][19];

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("basic/omok.txt");
		Scanner sc = new Scanner(in);
		ArrayList<int[]> one = new ArrayList<int[]>();
		ArrayList<int[]> two = new ArrayList<int[]>();
		int[] temp;
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					temp = new int[2];
					temp[0] = i;
					temp[1] = j;
					one.add(temp);
				}
				if (map[i][j] == 2) {
					temp = new int[2];
					temp[0] = i;
					temp[1] = j;
					two.add(temp);
				}
			}
		}
		sc.close();

		int check = 0;

		MainLoop: for (int t = 1; t <= 2; t++) {

			ArrayList<Integer> box = new ArrayList<>();
			if (t == 1) {
				box = getBoxSize(one);
			} else {
				box = getBoxSize(two);
			}
			int minx = box.get(0);
			int miny = box.get(2);
			int maxx = box.get(1);
			int maxy = box.get(3);

			// System.out.println(t+":"+minx+","+miny+","+maxx+","+maxy);

			if (maxx - minx >= 5) {
				for (int j = miny; j <= maxy; j++) {
					check = 0;
					for (int i = minx; i <= maxx; i++) {
						// System.out.println(i+ " "+j + " = " + map[i][j]);
						if (map[i][j] == t) {
							check++;
						} else {
							check = 0;
						}
						if (check == 5) {
							System.out.println(t);
							System.out.println(i - 3 + " " + (j + 1));
							break MainLoop;
						}
					}

				}
			}
			if (maxy - miny >= 5) {
				for (int i = minx; i <= maxx; i++) {
					check = 0;
					for (int j = miny; j <= maxy; j++) {
						if (map[i][j] == t) {
							check++;
						} else {
							check = 0;
						}
						if (check == 5) {
							System.out.println(t);
							System.out.println((i + 1) + " " + (j - 3));
							break MainLoop;
						}
					}
					

				}
			}

			if (maxx - minx >= 5 && maxy - miny >= 5) {
				for (int i = minx; i <= maxx - 4; i++) {
					for (int j = miny; j <= maxy - 4; j++) {
						check = 0;
						for (int x = 0; x < 5; x++) {
							if (map[i + x][j + x] == t) {
								check++;
								if (check == 5) {
									if (i + x + 1 < 19 && j + x + 1 < 19 && i-1 >=0 && j-1>=0) {
										if (map[i + x + 1][j + x + 1] != t && map[i-1][j-1]!=t) {
											System.out.println(t);
											System.out.println((i + 1) + " " + (j + 1));
											break MainLoop;
										}
									}
								}
							}
						}
						check = 0;
						for (int y = 0; y < 5; y++) {
							if (map[i + 4 - y][j + y] == t) {
								check++;
								if (check == 5) {
									System.out.println(t);
									System.out.println((i + 5) + " " + (j + 1));
									break MainLoop;
								}
							}
						}

					}
				}
				check = 0;
			}
		}
		if (check == 0){
			System.out.println(check);
		}

		// print();
	}

	public static ArrayList<Integer> getBoxSize(ArrayList<int[]> list) {
		ArrayList<Integer> resultSet = new ArrayList<>();
		resultSet.add(list.get(0)[0]); // minx
		resultSet.add(list.get(list.size() - 1)[0]);// maxx
		Collections.sort(list, new sorty());
		resultSet.add(list.get(0)[1]); // miny
		resultSet.add(list.get(list.size() - 1)[1]); // maxy
		return resultSet;
	}

	public static void print() {
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}

class sorty implements Comparator<int[]> {
	@Override
	public int compare(int[] o1, int[] o2) {
		return o1[1] - o2[1];
	}
}
