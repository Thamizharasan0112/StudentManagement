
import java.util.Map;  import java.util.HashMap;
public class StringArray {
    public static void main(String[] args) {




                String s = "banana";

                Map<Character, Integer> freq = new HashMap<>();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                }

                for (Map.Entry<Character, Integer> entry
                        : freq.entrySet()) {
                    System.out.println(
                            entry.getKey() + " = " + entry.getValue()
                    );
                }
            }
        }



