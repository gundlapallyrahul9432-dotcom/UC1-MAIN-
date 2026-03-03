import java.util.HashMap;

public class OOPSBannerApp {

    // Method to create a HashMap of character patterns
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // O
        charMap.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        // P
        charMap.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        // S
        charMap.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        return charMap;
    }

    // Method to display banner using the character map
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = charMap.get(message.charAt(0)).length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  "); // space between characters
            }
            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";  // Correct word
        displayBanner(message, charMap);
    }
}