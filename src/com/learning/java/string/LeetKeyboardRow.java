package com.learning.java.string;

public class LeetKeyboardRow {
	private static String row1 = "qwertyuiop";
	private static String row2 = "asdfghjkl";
	private static String row3 = "zxcvbnm";

	public String[] findWords(String[] words) {
		String[] intermediateList = new String[words.length];
		int count = 0;
		for (String word : words) {
			if (word.length() == 1) {
				intermediateList[count++] = new String(word);
				continue;
			}
			// step 1 : identify row
			String newWord = word.toLowerCase();
			String identifyRow = row1;
			if (row1.indexOf(newWord.charAt(0)) != -1) {
				identifyRow = row1;
			} else if (row2.indexOf(newWord.charAt(0)) != -1) {
				identifyRow = row2;
			} else if (row3.indexOf(newWord.charAt(0)) != -1) {
				identifyRow = row3;
			}
			int i = 1;
			// stick to that row,
			for (i = 1; i < word.length(); i++) {
				if (!identifyRow.contains(Character.toString(word.charAt(i)))) {
					break;
				}
			}
			if (i == word.length())
				intermediateList[count++] = new String(word);
		}
		String[] finalList = new String[count];
		for (int i = 0; i < count; i++) {
			finalList[i] = intermediateList[i];

		}
		return finalList;
	}
	public static void main(String[] args) {
		LeetKeyboardRow lkr = new LeetKeyboardRow();
		String[] list = new String[] { "Hello", "Alaska", "Dad", "Peace", "Qwerty" };
		lkr.findWords(list);
	}

}
