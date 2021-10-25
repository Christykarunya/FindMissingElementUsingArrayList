package week3.day2;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementInArrayUsingList {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 6, 8 };

		List<Integer> missEle = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			missEle.add(arr[i]);
		}

		// List<Integer> missEle = Arrays.asList(1,3,2,4,7,6,8);
		Collections.sort(missEle);// sort the array values
		System.out.println(missEle);
		System.out.println("Size of Array :" + missEle.size());
		for (int i = 1; i < missEle.size(); i++) {
			if (i!=missEle.get(i-1)){
				System.out.println(i);
				break;
		/*for(int i=0;i<missEle.size()-1;i++) {
			if((missEle.get(i)+1)!=missEle.get(i+1)) {
				System.out.println("Missing Element :" +(missEle.get(i)+1));
				*/
		}
		}
		//System.out.println("Missing Number in Array: " + missEle);
	}

}
