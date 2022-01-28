package edu.kis.vh.nursery.list;

/**
 * Node class is a base element of linked lists
 */
public class Node {

    private int value;
    private Node prev;
    private Node next;

    /**
     * Class constructor, sets node value to initial value
     * @param i initial value
     */
    public Node(int i) {
        setValue(i);
    }

    /**
     * Getter for "value" private field
     * @return value of "value" private field
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter for "value" private field
     * @param value value that will be assigned to "value" private field
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Getter for "prev" private field
     * @return value of "prev" private field
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Setter for "prev" private field
     * @param prev value that will be assigned to prev field
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Getter for "next" private field
     * @return value of "next" private field
     */
    public Node getNext() {
        return next;
    }

    /**
     * Setter for "next" private field
     * @param next value that will be assigned to "next" private field
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

// 1.4.3.4 - there is no unused setters throughout the codebase :(