import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        Map<Character, Integer> frequency = characterFrequency(input);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Character Frequencies: " + frequency);
        scanner.close();
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
