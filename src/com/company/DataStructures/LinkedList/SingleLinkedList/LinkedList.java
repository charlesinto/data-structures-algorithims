package com.company.DataStructures.LinkedList.SingleLinkedList;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    public void addFirst(T value){
        Node<T> node = new  Node<>();
        node.setValue(value);

        node.setNext(first);
        first = node;

        if(last == null)
           last  = node;

    }

    public T getKthNodeFromEnd(int k) throws IllegalAccessException {
        Node<T> node = first;
        Node<T> step = first;

        if(first == null)
            throw new IllegalAccessException("Empty list");

        for(int i = 0;  i < k ; i++){
            step = step.getNext();

            if(step == null) throw new IllegalAccessException("K is more than the length of the list");
        }


        while (step != null){
            node = node.getNext();
            step = step.getNext();
        }
        return node.getValue();
    }

    public void deleteFirst(T value){


        // if item exits at the first position
        if(first != null && first.getValue() == value){
            first = first.getNext();

            return ;
        }

        // traverse the list and get the node that has the value
        // update the pointers
        Node<T> curr = first;
        Node<T> prev = first ;

        while(curr != null){
            if(curr.getValue() == value){
                prev.setNext(curr.getNext());
                return ;
            }
            prev = curr;
            curr = curr.getNext();

        }
    }

    public boolean contains(T value){

       return indexOf(value) != -1;
    }

    public int indexOf(T value){
        int index = 0;
        // if item exits at the first position
        if(first != null && first.getValue() == value){
            first = first.getNext();

            return index;
        }

        // traverse the list and get the node that has the value
        // update the pointers
        Node<T> curr = first;


        while(curr != null){
            if(curr.getValue() == value){
                return index;
            }
            curr = curr.getNext();
            index++;
        }

        return  -1;
    }

    public void addLast(T value){
        Node<T> node = new  Node<>();
        node.setValue(value);
        if(first == null)
            first = last = node;

       last.setNext(node);

       last = node;
    }

    @Override
    public String toString() {
        String output = "[ ";

        while (first != null){
            output += first.getValue() + ", ";
            first = first.getNext();
        }
        return output + " ]";
    }
}
