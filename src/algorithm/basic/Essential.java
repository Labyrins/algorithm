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
		
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("B");
		stringlist.add("d");
		stringlist.add("e");
		stringlist.add("Ab");
		stringlist.add("F");
		stringlist.add("A");
		stringlist.add("a");
		stringlist.add("Ga");
		stringlist.add("a");
		
		
		ArrayList<Integer> asclist = new ArrayList<>();
		ArrayList<Integer> desclist = new ArrayList<>();
		
		int[] intlist2 = {3,5,1,8,2,3,8,4,1200,130};
		
		TreeSet ts = new TreeSet<>(intlist);
		System.out.println(ts);
		Iterator it = ts.descendingIterator();
		while(it.hasNext()){
//			System.out.print(it.next()+" ");
			desclist.add((Integer) it.next());
		}
		System.out.println(desclist);
		
		TreeSet ts2 = new TreeSet<>();
		for(int j=0; j<intlist2.length; j++){
			ts2.add(intlist2[j]);
		}
		System.out.println(ts2);
		
		
//		int[] revlist2 = new int[ts.size()];
//		
//		for(int j=ts.size(); j>0; j--){
//			revlist2[j] = 
//		}
		
		
//		Collections.reverse((List<?>) ts);
		
//		Arrays.sort(intlist2);
//		
//		System.out.println(intlist2);
//		
//		for(int i=0; i<intlist2.length; i++){
//			System.out.print(intlist2[i]+" ");
//		}
//		
//		
//		
//		System.out.println();
		
//		//중복제거
//		HashSet hs = new HashSet(intlist);
//		intlist = new ArrayList<>(hs);
//		
//		System.out.println(stringlist);
//		stringlist = new ArrayList<String>(new HashSet(stringlist));
//		System.out.println(stringlist);
//		Collections.sort(stringlist);
//		System.out.println(stringlist);
		
		//올림차순 정렬
		
		
		
		//내림차순 정렬
		
	
		//다양한 출력
		
		
		
	}

}
