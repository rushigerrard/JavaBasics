package com.learning.java.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LiveRampValidTime {
	
	public void permutations(ArrayList<Integer> al,int  currentNumber, ArrayList<Integer> list){
		if(al.isEmpty()){
			list.add(currentNumber);
			return ;
		}
			
		for(int i = 0; i < al.size(); i++){
			ArrayList<Integer> n = new ArrayList<>(al);
			n.remove(i);
			permutations(n, currentNumber * 10 + al.get(i), list);
		}
		return ;
	}
	public String solution(int a, int b, int c, int d){
		String hour, min;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		ArrayList<Integer> list = new ArrayList<>();
		permutations(al, 0, list);
		Collections.sort(list);
		for(int i = list.size() - 1; i >= 0; i--){
			if(list.get(i) / 100 <= 23 && list.get(i) % 100 <= 59){
				if(list.get(i) / 100 < 10){
					hour = "0" + list.get(i) / 100 ;
				}
				else{
					hour = "" + list.get(i) / 100 ;
				}
				if(list.get(i) % 100 < 10){
					min = "0" + list.get(i) % 100 ;
				}
				else{
					min = "" + list.get(i) % 100 ;
				}
				return hour + ":" + min;
			}
			
		}

		return "NOT POSSIBLE";
		
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LiveRampValidTime lrvt = new LiveRampValidTime();
		System.out.println(lrvt.solution(0, 0, 0, 0));
		System.out.println(lrvt.solution(2, 4, 0, 0));
		System.out.println(lrvt.solution(1, 2, 3, 8));
		System.out.println(lrvt.solution(3, 0, 7, 0));
		System.out.println(lrvt.solution(3, 0, 0, 0));
		System.out.println(lrvt.solution(9, 1, 7, 9));
		System.out.println(lrvt.solution(9, 1, 1, 9));
	}

}
