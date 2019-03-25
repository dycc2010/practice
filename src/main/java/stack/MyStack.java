package stack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyStack {
    private int[] array;
    private int top;
    private int maxSize;

    //初始化栈 设置 栈大小
    public MyStack(int size) {
        this.maxSize = size;
        array = new int[size];
        top = -1;
    }

    //压栈 判断栈是否满了 增加队列的标识大小 ++ 代表先运算
    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        }
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
