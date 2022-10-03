package com.company.DataStructures.LinkedList.DoubleLinkedList;

public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    public void addFirst(T value){
        Node<T> node = new Node<>();
        node.setValue(value);

        if(head == null)
            head = tail = node;
        else{
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }

        size++;
    }

    public void addLast(T value){
        Node<T> node = new Node<>();
        node.setValue(value);

        if(tail == null)
            head = tail = null;
        else{
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }

        size++;
    }

    public boolean contains(T value){
        return  indexOf(value) != -1;
    }

    public void deleteFirst(T value){
        if(head.getValue() == value){
            head = head.getNext();
            size--;
            return;
        }
        else if (tail.getValue() == value){
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
            size--;
            return;
        }


        Node<T> current = head.getNext();

        while (current != null){
            if(current.getValue() == value){
                current.getNext().setPrevious(current.getPrevious());
                current.getPrevious().setNext(current.getNext());
                size--;
                return ;
            }
            current = current.getNext();
        }


    }

    public int indexOf(T value){
        if(head.getValue() == value)
            return 0;
        else if (tail.getValue() == value)
            return size -1;

        int count = 1;
        Node<T> current = head.getNext();
        while (current != null){
            if(current.getValue() == value)
                return count;

            current = current.getNext();
            count++;
        }

        return -1;
    }

    public void insertAt(int pos, T value){


        if(pos > size || pos < 0)
            return ;

        else if(pos == 0){
            addFirst(value);
            return;
        }
        else if (pos == size - 1){
            addLast(value);
            return;
        }

        Node current = head.getNext();
        int count = 1;
        while(count < size - 1){
            if(count == pos){
                Node<T> node = new Node();
                node.setValue(value);
                node.setPrevious(current);
                node.setNext(current.getNext());
                current.getNext().setPrevious(node);
                current.setNext(node);
                break;
            }

            count++;
            current = current.getNext();
        }

        size++;
    }

    @Override
    public String toString() {
        String output = "[ ";

        while (head != null){
            output += head.getValue() + ", ";

            head = head.getNext();

        }

        output += "]";

        return output;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
