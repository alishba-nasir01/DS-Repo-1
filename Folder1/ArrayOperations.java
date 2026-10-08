import java.util.Scanner;

public class ArrayOperations {

    static Scanner input = new Scanner(System.in);

    static void menu() {
        System.out.println("\n===== ARRAY MENU =====");
        System.out.println("1. Add value");
        System.out.println("2. Insert at index");
        System.out.println("3. Fill array");
        System.out.println("4. Delete last element");
        System.out.println("5. Delete by index");
        System.out.println("6. Display");
        System.out.println("7. Search value");
        System.out.println("8. Get value at index");
        System.out.println("9. Replace/Update value at index");
        System.out.println("10. Size");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
    }
    static int addValue(int[] arr, int size, int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return size;
        }

        arr[size] = value;
        size++;

        System.out.println("Value added successfully.");
        return size;
    }
    static int insertAtIndex(int[] arr, int size, int index, int value) {
        if (size == arr.length) {
            System.out.println("Array is full!");
            return size;
        }

        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
            return size;
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;

        System.out.println("Value inserted successfully.");
        return size;
    }
    static int fillArray(int[] arr, int size) {
        System.out.println("Enter values (-1 to stop):");

        while (size < arr.length) {
            System.out.print("Enter value: ");
            int value = input.nextInt();

            if (value == -1) {
                break;
            }

            arr[size] = value;
            size++;
        }

        System.out.println("Array filling completed.");
        return size;
    }

    static int deleteLast(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty!");
            return size;
        }

        size--;
        System.out.println("Last element deleted.");
        return size;
    }

    static int deleteByIndex(int[] arr, int size, int index) {
        if (size == 0) {
            System.out.println("Array is empty!");
            return size;
        }

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return size;
        }

  
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.println("Element deleted successfully.");
        return size;
    }

    static void display(int[] arr, int size) {
        if (size == 0) {
            System.out.println("Array is empty!");
            return;
        }

        System.out.println("Array elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
    static void search(int[] arr, int size, int value) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Value found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Value not found.");
        }
    }
    static void getValue(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        System.out.println("Value at index " + index + " = " + arr[index]);
    }

    static void updateValue(int[] arr, int size, int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        arr[index] = value;

        System.out.println("Value updated successfully.");
    }

    static void showSize(int size) {
        System.out.println("Current number of elements: " + size);
    }

    public static void main(String[] args) {

        System.out.print("Enter maximum array size: ");
        int capacity = input.nextInt();

        int[] arr = new int[capacity];
        int size = 0;

        int choice;

        do {
            menu();
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    size = addValue(arr, size, value);
                    break;

                case 2:
                    System.out.print("Enter index: ");
                    int index = input.nextInt();

                    System.out.print("Enter value: ");
                    value = input.nextInt();

                    size = insertAtIndex(arr, size, index, value);
                    break;

                case 3:
                    size = fillArray(arr, size);
                    break;

                case 4:
                    size = deleteLast(arr, size);
                    break;

                case 5:
                    System.out.print("Enter index to delete: ");
                    index = input.nextInt();

                    size = deleteByIndex(arr, size, index);
                    break;

                case 6:
                    display(arr, size);
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    value = input.nextInt();

                    search(arr, size, value);
                    break;

                case 8:
                    System.out.print("Enter index: ");
                    index = input.nextInt();

                    getValue(arr, size, index);
                    break;

                case 9:
                    System.out.print("Enter index: ");
                    index = input.nextInt();

                    System.out.print("Enter new value: ");
                    value = input.nextInt();

                    updateValue(arr, size, index, value);
                    break;

                case 10:
                    showSize(size);
                    break;

                case 11:
                    System.out.println("Program exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        input.close();
    }
}
