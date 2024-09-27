package Generics;

public class MyArrayList<T> {
    private T[] arr;  // Internal array to store elements
    private int size; // Number of elements in the list
    private int capacity; // Current capacity of the list

    // Default constructor
    public MyArrayList() {
        capacity = 10; // Initial capacity
        arr = (T[]) new Object[capacity]; // Create the array
        size = 0; // Initialize size to 0
    }

    // Add an element to the list
    public void add(T value) {
        if (size == capacity) {
            resize();
        }
        arr[size] = value;
        size++;
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return arr[index];
    }

    // Remove an element at a specific index
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removedElement = arr[index];

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = null; // Optional: clear the last element
        size--;
        return removedElement;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Resize the internal array when it is full
    private void resize() {
        capacity = capacity * 2; // Double the capacity
        T[] newArr = (T[]) new Object[capacity]; // Create a new array with doubled capacity

        // Copy the old array to the new array
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr; // Assign the new array to the internal array
    }
}
