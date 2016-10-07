package com.learning.java.basics;

import java.util.ArrayList;
import java.util.Iterator;

import javax.naming.directory.InitialDirContext;

public class Iterate {

	public Iterate(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(11);
		arr.add(13);
		arr.add(14);
		
		Iterator i = arr.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate it = new Iterate();
		
	}

}
