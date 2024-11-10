// Class for Dynamic Array Implementation in Java
class Array {
    private int[] arr; // Array to store elements
    private int size; // Current number of elements
    private int capacity; // Current capacity of the array

    // Constructor to initialize the dynamic array
    public Array() {
        capacity = 2;
        arr = new int[capacity];
        size = 0;
    }

    // Method to resize the array when capacity is reached
    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Method to insert an element into the array
    public void insert(int element) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = element;
    }

    // Method to remove the first occurrence of an element by value
    public void delete(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                return; // Exit after deleting the first occurrence
            }
        }
        System.out.println("Value not found.");
    }

    // Method to traverse and print the array
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

// Main class to test the DynamicArray class
public class DynamicArray {
    public static void main(String[] args) {
        // Dynamic Array test case
        Array dynamicArray = new Array();

        // Performing operations
        dynamicArray.insert(1);
        dynamicArray.insert(2);
        dynamicArray.delete(1);
        System.out.println("Expected Output: [2]");
        System.out.print("Actual Output: ");
        dynamicArray.traverse(); 
    }
}
