package stack;

import java.util.Stack;

public class MyStackTest {
    public static void main(String[] args) {
//        MyStack myStack = new MyStack(5);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(5);
//        System.out.println(myStack.isFull());
//        System.out.println(myStack.isEmpty());
//        System.out.println(myStack.peek());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.peek());

        Stack stack = new Stack();
        String s = "hello world!";
        char[] chars = s.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
