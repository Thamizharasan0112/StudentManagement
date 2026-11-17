import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("silent", "listen"));
    }
}
