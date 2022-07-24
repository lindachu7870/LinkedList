package com.zipcodewilmington.singlylinkedlist;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private Node head;
    private int listCount;

    public SinglyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        Node tmp = new Node(data);
    }

}
