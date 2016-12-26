package com.learning.java.comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoComparator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(234);
		al.add(314);
		al.add(323);
		al.add(231);
		al.add(233);
		al.add(134);

		ComparatorImpl com = new ComparatorImpl(){
			@Override
			public int compare(Integer arg0, Integer arg1) {
				if(arg0 % 10 > arg1 % 10)
					return 1;
				return -1;
			}
		};
		Collections.sort(al, com);
		for(Integer i : al)
			System.out.println(i);
		
		System.out.println("--------");
		
		Comparator<Integer> diffCom = (o1, o2)->
			{
				if(o1 % 100 > o2 % 100)
					return 1;
				return -1;
				
			};
			
		Collections.sort(al, diffCom);
		
		
		for(Integer i : al)
			System.out.println(i);
	}

}
