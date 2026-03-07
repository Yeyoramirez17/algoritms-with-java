package com.algorithms.datastructure.stack;

import java.util.EmptyStackException;

/**
 * @param <T> the type of elements held in this stack
 */
public interface IStack<T> {
    /**
     * Pushes an item onto the top of this stack.
     * @param data the item to be pushed onto this stack.
     */
    void push(T data);

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @return the object at the top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    T pop();

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return the object at the top of this stack.
     * @throws EmptyStackException if this stack is empty.
     */
    T peek();

    /**
     * Checks if this stack is empty.
     * @return true if this stack is empty, false otherwise.
     * @throws EmptyStackException if this stack is empty.
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return the number of items in this stack.
     */
    int size();

    /**
     * Removes all items from this stack.
     */
    void clear();
}
