// Class representing a static array with basic operations
class Array {
    private int[] array; 
    private int size; 
    private int length; 

    // Constructor to initialize the array with the given size
    public Array(int size) {
        this.size = size;
        this.array = new int[size];
        this.length = 0; 
    }

    // Method to insert a value into the array
    public void insert(int value) {
       
        if (length < size) {
            array[length] = value; 
            length++; 
        } else {
            System.out.println("Array is FULL"); 
        }
    }

    // Method to delete the first occurrence of a value from the array
    public void delete(int value) {
       
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                
                for (int j = i; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                length--; 
                break; 
            }
        }
    }

    // Method to print the elements of the array
    public void traverse() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]); 
            if (i < length - 1) {
                System.out.print(", "); 
            }
        }
        System.out.println("]"); 
    }
}

// Main class to demonstrate the Array class operations
public class StaticArray {
    public static void main(String[] args) {
        // Static Array test case
        Array staticArr = new Array(5);
        staticArr.insert(1);
        staticArr.insert(2);
        staticArr.delete(1);
        System.out.println("Expected Output: [2]");
        System.out.print("Actual Output: ");
        staticArr.traverse();
    }
}
