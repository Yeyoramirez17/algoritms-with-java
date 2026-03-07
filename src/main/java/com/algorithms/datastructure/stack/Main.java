package com.algorithms.datastructure.stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stString = new Stack<>();
        stString.push("Hello");
        stString.push("Word");

        System.out.println(stString.toString());
        stString.pop();
        stString.push("Banana");
        stString.push("Apple");
        System.out.println(stString.toString());

        System.out.println("Peek: " + stString.peek());

        Stack<Integer> stInt = new Stack<>();
        stInt.push(1);
        stInt.push(2);
        stInt.push(3);
        stInt.push(4);

        System.out.println(stInt.toString());
        System.out.println("Size: " + stInt.size());
        stInt.clear();
        System.out.println(stInt.toString());
    }
}
