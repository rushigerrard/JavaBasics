import java.util.ArrayList;
import java.util.Scanner;

public class BinAndHexa{
	
	
	public static boolean compareBinToHex(String binary, String hex){
		int n2 = convertToBase(binary, 2);
		int n16 = convertToBase(hex, 16);
		if(n2 < 0 || n16 < 0 ){
			return false;
		}
		else{
			return n16 == n2;
		}
	}
	
	private static int convertToBase(String number, int base) {
		if(base < 2 || (base > 10 && base != 16))
			return -1;
		int value = 0;
		for(int i = number.length(); i >= 0; i--){
			System.out.println(number.charAt(i));
			int digit = digitToValue(number.charAt(i));
			
			if(digit < 0 || digit >= base)
				return -1;
			int exp = number.length() - 1 - i;
			value += digit * Math.pow(base, exp);
		}
		// TODO Auto-generated method stub
		return value;
	}

	private static int digitToValue(char c) {
		if(c >= '0'&& c <= '9')
			return c - '0';
		else if(c >= 'A'&& c <= 'F')
			return 10 + c - 'A';
		else if(c >= 'a'&& c <= 'f')
			return 10 + c - 'a';
		return -1;
	}

	public static void main(String args[]){
		System.out.println(compareBinToHex("1111", "F"));
		return;
	}
}