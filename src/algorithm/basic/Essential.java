package algorithm.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Essential {

	public static void main(String[] args) {
		
		//Array생성
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(3);
		intlist.add(5);
		intlist.add(1);
		intlist.add(8);
		intlist.add(2);
		intlist.add(3);
		intlist.add(8);
		intlist.add(4);
		intlist.add(1200);
		intlist.add(130);
		
		ArrayList<Integer> desclist = new ArrayList<>();
		
		int[] intlist2 = {3,5,1,8,2,3,8,4,1200,130};
		
		TreeSet<Integer> ts = new TreeSet<>(intlist);
		System.out.println(ts);
		Iterator<Integer> it = ts.descendingIterator();
		while(it.hasNext()){
			desclist.add((Integer) it.next());
		}
		System.out.println(desclist);
		
		TreeSet<Integer> ts2 = new TreeSet<>();
		for(int j=0; j<intlist2.length; j++){
			ts2.add(intlist2[j]);
		}
		System.out.println(ts2);
		
	}

}
