package Stack;

import java.util.HashMap;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Integer min;



    public MinStack() {
        this.stack = new Stack<>();
    }


    public void push(int value) {
        if(stack.isEmpty()) {
            min = value;
        }
        this.stack.push(value);
        if(min > value)  {
            min = value;
        }


    }

    public void pop() {
        this.stack.pop();
        if(min == stack.getFirst()) {

        }
        if(stack.isEmpty()) {
            min = null;
        }
    }

    public int top() {
        return this.stack.getFirst();
    }

    public int getMin() {
        return min;


    }

}