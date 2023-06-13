package Branch_Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

     public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = perm(str);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> perm(String str) {
        List<String> result = new ArrayList<>();
        if (str.length() == 0) {
            result.add("");
            return result;
        }

        char first = str.charAt(0);
        String remaining = str.substring(1);
        List<String> words = perm(remaining);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String permuted = word.substring(0, i) + first + word.substring(i);
                result.add(permuted);
            }
        }

        return result;
    }
}

