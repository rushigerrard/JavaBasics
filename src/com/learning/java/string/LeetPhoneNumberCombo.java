package com.learning.java.string;

import java.util.ArrayList;
import java.util.List;

public class LeetPhoneNumberCombo {

    private static char[][] telephone = new char[10][4];
    private List<String> list = new ArrayList<>();
    
    static{
        telephone[2] = new char[]{'a', 'b', 'c', '0'};
        telephone[3] = new char[]{'d', 'e', 'f', '0'};
        telephone[4] = new char[]{'g', 'h', 'i', '0'};
        telephone[5] = new char[]{'j', 'k', 'l', '0'};
        telephone[6] = new char[]{'m', 'n', 'o', '0'};
        telephone[7] = new char[]{'p', 'q', 'r', 's'};
        telephone[8] = new char[]{'t', 'u', 'v', '0'};
        telephone[9] = new char[]{'w', 'x', 'y', 'z'};
        
    }
    private void _letterCombinations(String digits, int i, String sequence){
        if(i == digits.length()){
        	System.out.println(sequence);
            list.add(sequence);
            return ;
        }
        Integer currentDigit = Character.getNumericValue(digits.charAt(i));
        for(int j = 0; j < 4; j++){
            if(telephone[currentDigit][j] != '0'){
                String newSequence = sequence + telephone[currentDigit][j];
                _letterCombinations(digits, i + 1, newSequence);
                newSequence = sequence;
            }
        }
    }
    
    public List<String> letterCombinations(String digits) {
        if(digits.contains(String.valueOf('0')) || digits.contains(String.valueOf('1')) || digits.length() == 0)
            return new ArrayList<String>();   
        _letterCombinations(digits, 0, "");
        return list;
    }
	public static void main(String[] args) {
		LeetPhoneNumberCombo lpnc = new LeetPhoneNumberCombo();
		lpnc.letterCombinations("234");
	}

}
