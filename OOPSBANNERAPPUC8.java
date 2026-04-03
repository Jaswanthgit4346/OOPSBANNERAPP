import java.util.HashMap;
import java.util.Map;

public class OOPSBANNERAPPUC8 {

    // Method to initialize character patterns
    public static Map<Character, String[]> initPatterns() {
        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            " ******** ",
            " *      * ",
            " *      * ",
            " *      * ",
            " *      * ",
            " *      * ",
            " ******** "
        });

        charMap.put('P', new String[]{
            " ******** ",
            " *      * ",
            " *      * ",
            " ******** ",
            " *        ",
            " *        ",
            " *        "
        });

        charMap.put('S', new String[]{
            " ******** ",
            " *        ",
            " *        ",
            " ******** ",
            "        * ",
            "        * ",
            " ******** "
        });

        return charMap;
    }

    // Function to render a word using the character map
    public static void renderWord(String word, Map<Character, String[]> charMap) {
        for (int i = 0; i < 7; i++) { // 7 lines per banner
            for (char c : word.toCharArray()) {
                String[] pattern = charMap.get(c);
                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> charPatterns = initPatterns();
        String word = "OOPS";

        renderWord(word, charPatterns);
    }
}