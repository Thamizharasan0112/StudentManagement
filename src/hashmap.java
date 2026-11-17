
    import java.util.HashMap;
import java.util.Map;


    public class hashmap {

        public static String firstNonRepeating(String s) {
            Map<Character, Integer> freq = new HashMap<>();
            String res = "";

            for (char ch : s.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            for (char ch : s.toCharArray()) {
                if (freq.get(ch) == 1) {
                    res += ch;
                }
            }

            return res; // No non-repeating character
        }
        public static void main(String[] args) {
            System.out.println(firstNonRepeating("swiss"));
        }
    }

