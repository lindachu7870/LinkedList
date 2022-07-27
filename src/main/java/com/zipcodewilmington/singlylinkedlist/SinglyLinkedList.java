package com.zipcodewilmington.singlylinkedlist;

import org.w3c.dom.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private static Node[] singlyLinkedList = new Node[0];

    public SinglyLinkedList(Node[] nodeArr) {
        singlyLinkedList = nodeArr;
    }

    public SinglyLinkedList() {
    }

    public Node get(Integer point) {
        return singlyLinkedList[point];
    }

    public void add(Node node) {
        Node [] addArrList = new Node[singlyLinkedList.length + 1];
        System.arraycopy(singlyLinkedList, 0, addArrList, 0, singlyLinkedList.length);
        addArrList[singlyLinkedList.length] = node;
        singlyLinkedList= addArrList;
    }

    public boolean contains(Node node) {
        for (Node n : singlyLinkedList) {
            if (n == node) {
                return true;
            }
        }
        return false;
    }
}
