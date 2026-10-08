class Stack {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack elements:");
        stack.display();
    }
}
