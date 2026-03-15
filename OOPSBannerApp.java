import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Method to build and return the character pattern map
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patternMap;
    }

    // Method to render the banner message
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        // Build pattern map
        Map<Character, String[]> patterns = buildCharacterPatterns();

        // Message to display
        String message = "OOPS";

        // Render banner
        renderBanner(message, patterns);
    }
}