package com.company;

import com.company.DASolutions.CircularArray;
import com.company.DASolutions.StringReverse;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringReverse stringReverse = new StringReverse();

        CircularArray<Integer> items = new CircularArray<>(5);

        items.add(0);
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        items.add(6);

        System.out.println("items> "+ items);
//        LinkedList<Integer> list = new LinkedList<>();
//
//        list.addFirst(10);
//        list.addFirst(20);
//        list.addFirst(30);
//        list.addFirst(40);
//        list.addFirst(50);
//        list.addFirst(60);
//        list.addLast(5);
//        list.addLast(0);
//        list.addLast(2);
//        list.deleteFirst(60);
//
//        try {
//            // pos = k - 1
//            System.out.println( list.getKthNodeFromEnd(3));
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("contains 50: " + list.contains(500));
//
//        System.out.println(list);

//        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
//
//        list2.addFirst(20);
//        list2.addFirst(30);
//        list2.addFirst(40);
//        list2.addFirst(50);
//        list2.addFirst(60);
//        list2.addLast(0);
//        list2.insertAt(1, 90);
//        list2.insertAt(0, 25);
//        list2.insertAt(7, 72);
//        list2.insertAt(4, 32);
//        list2.deleteFirst(72);
//        System.out.println("Contains 25: " + list2.contains(5));
//        System.out.println("Index of 32: "+ list2.indexOf(32));
//        System.out.println("List Size: " + list2.getSize());
//        System.out.println(list2);
    }
}
