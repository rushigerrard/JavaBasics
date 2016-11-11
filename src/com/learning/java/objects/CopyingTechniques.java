package com.learning.java.objects;

class A implements Cloneable{
	int i;
	int j;
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
}
public class CopyingTechniques {


	public static void main(String[] args) {
		
		A a = new A();
		a.i = 5;
		a.j = 6;
		
		//Shallow copy
		A shallow = a;
		System.out.println(shallow.i + " " + shallow.j );
		shallow.i = 7; shallow.j = 8;
		System.out.println(a.i + " " + a.j );

		//Deep copy
		A deep = new A();
		deep.i = a.i; deep.j = a.j;
		System.out.println(deep.i + " " + deep.j );
		
		//Cloning an object
		try{
			A clone = (A) a.clone();
			System.out.println(clone.i + " " + clone.j );
		}catch(CloneNotSupportedException e){
			System.out.println("Unable to clone");
		}
	}

}
