package com.company.DASolutions;

import java.util.Arrays;

public class CircularArray<T> {
    private T[] contents;
    private int count = 0;

    public T[] getContents() {
        return contents;
    }

    public CircularArray(int capacity){
        contents = (T[]) new Object[capacity];
    }

    public void add(T item){
        contents[count % getContents().length] = item;
        count++;
    }



    @Override
    public String toString() {
        return Arrays.toString(contents);
    }
}
