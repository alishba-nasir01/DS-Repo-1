import java.util.Scanner;

public class StackOperations {

    static int[] stack = new int[5];  
    static int top = -1;              

    static void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Popped value: " + stack[top]);
            top--;
        }
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("Stack values (Top to Bottom):");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    static void size() {
        System.out.println("Current stack size: " + (top + 1));
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static boolean isFull() {
        return top == stack.length - 1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
                    int value = input.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    size();
                    break;

                case 5:
                    if (isEmpty())
                        System.out.println("Stack is Empty.");
                    else
                        System.out.println("Stack is NOT Empty.");
                    break;

                case 6:
                    if (isFull())
                        System.out.println("Stack is Full.");
                    else
                        System.out.println("Stack is NOT Full.");
                    break;

                case 7:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        input.close();
    }
}
