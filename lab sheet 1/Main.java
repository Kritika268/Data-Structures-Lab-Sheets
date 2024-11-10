import java.util.HashMap;
import java.util.Map;

// Class for Static Array Implementation
class StaticArray {
    private int[] arr;
    private int size;
    private static final int MAX_SIZE = 100;

    public StaticArray() {
        arr = new int[MAX_SIZE];
        size = 0;
    }

    // Insert element at specified index
    public void insert(int element, int index) {
        if (size >= MAX_SIZE || index < 0 || index > size) {
            System.out.println("Insertion not possible.");
            return;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
    }

    // Remove element at specified index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Deletion not possible.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Traverse the static array
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}

// Class for Dynamic Array Implementation
class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }

    // Insert element in the dynamic array
    public void insert(int element) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = element;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    // Remove element at specified index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Deletion not possible.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Traverse the dynamic array
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}

// Class for String Operations
class StringOperations {
    // Concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Extract a substring from a given string
    public String substring(String str, int start, int length) {
        if (start < 0 || start >= str.length() || start + length > str.length()) {
            return "";
        }
        return str.substring(start, start + length);
    }

    // Compare two strings lexicographically
    public boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    // Count frequency of each character in a string
    public Map<Character, Integer> characterFrequency(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }
        return frequency;
    }
}

// Demonstration of StringOperations
public class Main {
    public static void main(String[] args) {
        // Static Array test case
        System.out.println("Static Array Operations:");
        StaticArray staticArr = new StaticArray();
        staticArr.insert(1, 0);
        staticArr.insert(2, 1);
        staticArr.remove(0);
        System.out.println("Expected Output: [2]");
        System.out.print("Desired Output: ");
        staticArr.traverse();

        // Dynamic Array test case
        System.out.println("\nDynamic Array Operations:");
        DynamicArray dynamicArr = new DynamicArray();
        dynamicArr.insert(1);
        dynamicArr.insert(2);
        dynamicArr.remove(0);
        System.out.println("Expected Output: [2]");
        System.out.print("Desired Output: ");
        dynamicArr.traverse();

        // String Operations test case
        System.out.println("\nString Operations:");
        StringOperations so = new StringOperations();
        String str1 = "hello";
        String str2 = "world";

        // Concatenate strings
        System.out.println("Concatenation: " + so.concatenate(str1, str2));

        // Extract a substring
        System.out.println("Substring: " + so.substring(str1, 3, 2));

        // Compare two strings
        System.out.println("Comparison: " + (so.compare(str1, str2) ? "True" : "False"));

        // Character frequency
        String testString = "hello";
        Map<Character, Integer> freq = so.characterFrequency(testString);
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
