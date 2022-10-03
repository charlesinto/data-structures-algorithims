package com.company.DataStructures.LinkedList.SingleLinkedList;

public class Node<T> {
    private T value;
    private Node next;

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
