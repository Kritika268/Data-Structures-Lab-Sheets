import java.util.HashMap;

class Str {
    public String concatenate(String str1, String str2) {
            return (str1 + str2);
    }

    // Method to perform substring operation
    public String substring(String str, int start, int end) {
        return str.substring(start + 1, end + 1);
    }

    // Method to compare two strings
    public boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    // Method to calculate character frequency
    public HashMap<Character, Integer> characterFrequency(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap;
    }
}

public class StringOperations {
    public static void main(String[] args) {
        Str strOps = new Str();

        System.out.println("Concatenation: " + strOps.concatenate("hello", "world"));
        System.out.println("Substring: " + strOps.substring("hello", 2, 4));
        System.out.println("Comparison: " + strOps.compareStrings("hello", "world"));
        System.out.println("Character Frequency: " + strOps.characterFrequency("hello"));
    }
}