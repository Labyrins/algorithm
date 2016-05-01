/*
 * http://www.jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=788
 */

package algorithm.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String end = "";
		String temp;
		ArrayList<String> input = new ArrayList<String>();
		
		while(!end.equalsIgnoreCase("END")){
			temp = sc.next();
			if(temp.equalsIgnoreCase("END")){
				end = "END";
			}else{
				input.add(temp);
			}
		}
		sc.close();
		
		ArrayList<String> resultString = new ArrayList<String>();
		ArrayList<Integer> resultCount = new ArrayList<Integer>();
		int index;
		for(int i=0; i<input.size(); i++){
			temp = input.get(i);
			if(resultString.contains(temp)){
				index = resultString.indexOf(temp);
				 resultCount.set(index, resultCount.get(index) + 1);
			}else{
				resultString.add(temp);
				resultCount.add(1);
			}
		}
		
		for(int i=0; i<resultString.size();i++){
			System.out.println(resultString.get(i)+ " : " + resultCount.get(i));
		}

	}

}

//이런 근본도 없는 사전순 정렬 결과값 추
//Input Data
//Gcr fIC jZhMzS jiKO S^pHU^ XolaRRPo VRPQ _eLfnN S^pHU^ _eLfnN _eLfnN fIC
//]AHK hhNnV hhNnV raD mCVFkhfe]R qnc[[]OzWS oJOA\fOcrK ]AHK hhNnV hhNnV qnc[[]OzWS qnc[[]OzWS ` ` URH\oAtGN
//END
//
//CPU Result
//Gcr : 1
//S^pHU^ : 2
//VRPQ : 1
//XolaRRPo : 1
//_eLfnN : 3
//fIC : 2
//jZhMzS : 1
//jiKO : 1
//URH\oAtGN : 1
//]AHK : 2
//` : 2
//hhNnV : 4
//mCVFkhfe]R : 1
//oJOA\fOcrK : 1
//qnc[[]OzWS : 3
//raD : 1
//
//
//You Result
//Gcr : 1
//fIC : 2
//jZhMzS : 1
//jiKO : 1
//S^pHU^ : 2
//XolaRRPo : 1
//VRPQ : 1
//_eLfnN : 3
//]AHK : 2
//hhNnV : 4
//raD : 1
//mCVFkhfe]R : 1
//qnc[[]OzWS : 3
//oJOA\fOcrK : 1
//` : 2
//URH\oAtGN : 1
