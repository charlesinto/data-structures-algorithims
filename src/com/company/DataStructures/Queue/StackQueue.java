package com.company.DataStructures.Queue;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public  StackQueue(){
        stack1 = new Stack<>();
    }
    public void enqueue(T item){
        stack1.add(item);
    }

    public T dequeue(){
        stack2 = new Stack<>();

        // revers the stack so the first item comes to the front FIFO
        while (!stack1.empty())
            stack2.push(stack1.pop());

        T frontItem = stack2.pop();

        //reverse the stack so the last item comes to the front LIFO
        while (!stack2.empty())
            stack1.push(stack2.pop());

        return frontItem;
    }

    @Override
    public String toString() {
        stack2 = new Stack<>();

        // revers the stack so the first item comes to the front FIFO
        while (!stack1.empty())
            stack2.push(stack1.pop());

        StringBuffer output = new StringBuffer();

        output.append(Arrays.toString(stack2.toArray()));



        //reverse the stack so the last item comes to the front LIFO
        while (!stack2.empty())
            stack1.push(stack2.pop());


        return  output.toString();
    }
}
