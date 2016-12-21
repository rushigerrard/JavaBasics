package com.learning.generics;

public class BoundedType <T extends Number> {
	T[] obj;
	public BoundedType(){
		
	}
	BoundedType(T[] list) {
		obj = list;
	}
	public void setObj(T[] list){
		obj = list;
	}
	
	public double getAverage(){
		double sum = 0;
		for(int i = 0; i < obj.length; i++){
			sum += obj[i].doubleValue();
		}
		
		return sum / obj.length;
	}
	
	// ? <----- Is the wildcard
	public boolean sameAverage(BoundedType<? extends Number> obj){
		if(getAverage() == obj.getAverage())
			return true;
		return false;
	}
}
