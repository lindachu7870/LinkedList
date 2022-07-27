package com.zipcodewilmington.singlylinkedlist;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();

        singlyLinkedList.add(node);

        Assert.assertTrue(singlyLinkedList.contains(node));
    }
}
