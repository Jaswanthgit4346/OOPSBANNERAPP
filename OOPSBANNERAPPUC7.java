import java.util.*;

// UC7: Store Character Pattern in a Class
public class OOPSBANNERAPPUC7 {

    // Static inner class to store each character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store character → pattern mappings
    static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Initialize patterns
    static {
        patternMap.put('O', new CharacterPattern('O', new String[]{
            " ******** ",
            " *      * ",
            " *      * ",
            " *      * ",
            " *      * ",
            " *      * ",
            " ******** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
            " ******** ",
            " *      * ",
            " *      * ",
            " ******** ",
            " *        ",
            " *        ",
            " *        "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
            " ******** ",
            " *        ",
            " *        ",
            " ******** ",
            "        * ",
            "        * ",
            " ******** "
        }));
    }

    public static void main(String[] args) {
        String word = "OOPS"; // Word to display in banner
        printBanner(word);
    }

    // Method to print banner for any word
    public static void printBanner(String word) {
        int lines = 7; // Each pattern has 7 lines
        for (int i = 0; i < lines; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(patternMap.get(c).getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}