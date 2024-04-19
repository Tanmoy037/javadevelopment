import java.util.ArrayList;
public class day12 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    }
}


public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class day12 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // prints 3
        System.out.println(stack.peek()); // prints 2
    }
}