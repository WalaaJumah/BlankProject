/**
 * @author w.jumaa
 * @projectName EurekaJo_Automation
 * @classDescription
 */

package helper_classes;

import helper_classes.Helper;

import java.util.Random;

public class DataHelper extends Helper {
    // Method to generate text with a dynamic number of characters
    public static String generateText(int numCharacters) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        // ASCII range for printable characters: 32 to 126
        int minAscii = 32;
        int maxAscii = 126;

        for (int i = 0; i < numCharacters; i++) {
            int randomAscii = random.nextInt(maxAscii - minAscii + 1) + minAscii;
            sb.append((char) randomAscii);
        }

        return sb.toString();
    }
}
