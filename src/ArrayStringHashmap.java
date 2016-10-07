import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayStringHashmap{
	
	public HashMap <Integer, Student> buildmap(Student[] student){
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		for(Student s : student){
			map.put(s.getId(), s);
			
		}
		return map;
		
	}
	
	public ArrayList<Student> buildArray(Student[] student){
		return null;
		
	}
	
	public static void main(String args[]){
		String a = "Hello";
		String b = "elloH";
		char tmp;
		String a1 = new StringBuilder(a).reverse().toString();
		System.out.println( "String is " + a1);
		isAnagram(a,b);
	}

	private static void isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		if(Arrays.equals(ac, bc)){
			System.out.println("It is an anagram");
		}else{
			System.out.println("Nope. It isn't.");
		}
	}
}