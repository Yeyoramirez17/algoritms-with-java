package com.algorithms.datastructure.stack;

import java.util.EmptyStackException;

/**
 * Stack implementation using a linked list. The stack follows the Last In First Out (LIFO) principle, 
 * where the last element added to the stack is the first one to be removed.
 */
public class Stack<T> implements IStack<T>{

    private Node<T> top;
    private int size;

    Stack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        this.top = newNode;
        this.size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = this.top.getData();
        this.top = this.top.getNext();
        this.size--;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.getData();
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        if(isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node<T> current = top;

        while (current != null) {
            sb.append(current.getData());

            if(current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");

        return sb.toString();
    }

}
