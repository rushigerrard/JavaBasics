package com.learning.java.string;

public class InformaticaRemovePattern {

	static int maxRounds_utility(String s, String t) {
        StringBuilder string_s = new StringBuilder(s);
        int len_t = t.length();
        if (len_t == 0)
            return 0;
        int rounds = 0;
        while (true) {
            int substr_index = string_s.indexOf(t);
            if (substr_index == -1 || string_s.length() == 0)
                break;
            string_s.delete(substr_index, substr_index + len_t);
            rounds++;
        }
        return rounds;
    }

    static int maxRounds(String s, String t) {
        return Math.max(maxRounds_utility(s, t),
                maxRounds_utility(new StringBuilder(s).reverse().toString(),
                        new StringBuilder(t).reverse().toString()));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
