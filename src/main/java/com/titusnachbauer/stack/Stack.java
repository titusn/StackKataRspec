package com.titusnachbauer.stack;

import java.util.EmptyStackException;

public class Stack {

    private boolean empty = true;
    private Integer number;

    public boolean isEmpty() {
        return empty;
    }

    public int pop() {
        if (empty) {
            throw new EmptyStackException();
        } else {
            empty = true;
            return number;
        }
    }

    public void push(int i) {
        empty = false;
        number = i;
    }
}
